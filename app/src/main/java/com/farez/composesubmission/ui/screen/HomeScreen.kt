package com.farez.composesubmission.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.farez.composesubmission.MainVMFactory
import com.farez.composesubmission.MainViewModel
import com.farez.composesubmission.data.repository.MessengerRepository
import com.farez.composesubmission.ui.components.MessengerItem
import com.farez.composesubmission.ui.components.SearchBar

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    mainViewModel: MainViewModel = viewModel(factory = MainVMFactory(MessengerRepository())),
    navigateTODetail:(String) -> Unit,
    navHostController: NavHostController = rememberNavController()

) {
    val query by mainViewModel.query
    val messengers by mainViewModel.xyz.collectAsState()
    Box(modifier = modifier) {
        LazyColumn(
            contentPadding = PaddingValues(bottom = 50.dp)
        ) {
            item {
                SearchBar(
                    query = query,
                    onQueryChange = mainViewModel::search,
                )
            }
            messengers.forEach { (initial, messengers) ->
                items(messengers, key = {it.id}) {
                    MessengerItem(
                        it.name,
                        it.url,
                        modifier = modifier.clickable { navigateTODetail(it.id) })
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    HomeScreen(navigateTODetail = {
    })
}