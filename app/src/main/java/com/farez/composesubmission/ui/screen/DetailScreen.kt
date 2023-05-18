package com.farez.composesubmission.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.farez.composesubmission.DetailViewModel
import com.farez.composesubmission.MainVMFactory
import com.farez.composesubmission.data.repository.MessengerRepository
import com.farez.composesubmission.ui.common.UiState
import com.farez.composesubmission.ui.components.Header

@Composable
fun DetailScreen(
    messengerId: String?,
    viewModel: DetailViewModel = viewModel(factory = MainVMFactory(MessengerRepository.getInstance()))
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let {
        when(it) {
            is UiState.Error -> {}
            is UiState.Loading -> viewModel.getMessengerById(messengerId!!)
            is UiState.Success -> {
                val data = it.data
                Header(url = data.url, name = data.name, desc = data.desc)
            }
        }
    }
}