package com.farez.composesubmission

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.farez.composesubmission.data.model.Messenger
import com.farez.composesubmission.data.repository.MessengerRepository
import com.farez.composesubmission.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel(private val messengerRepository: MessengerRepository): ViewModel() {

    private val xxx = MutableStateFlow (
        messengerRepository.getMessengers()
            .sortedBy { it.name }
            .groupBy { it.name[0] }
    )
    val xyz : StateFlow<Map<Char, List<Messenger>>> get() = xxx

    private val _query = mutableStateOf("")
    val query : State<String> get() = _query
    fun search(q : String) = viewModelScope.launch {
        _query.value = q
        xxx.value = messengerRepository.searchMessenger(_query.value)
            .sortedBy { it.name }
            .groupBy { it.name[0] }
    }

}

class DetailViewModel(private val messengerRepository: MessengerRepository) : ViewModel() {
        private val _uiState: MutableStateFlow<UiState<Messenger>> = MutableStateFlow(UiState.Loading)
        val uiState: StateFlow<UiState<Messenger>> get() = _uiState


        fun getMessengerById(messengerId: String) {
            viewModelScope.launch {
                _uiState.value = UiState.Loading
                _uiState.value = UiState.Success(messengerRepository.getMessengerById(messengerId))
            }
        }
}
class MainVMFactory(private val messengerRepository: MessengerRepository) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(messengerRepository) as T
        }
        else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(messengerRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}