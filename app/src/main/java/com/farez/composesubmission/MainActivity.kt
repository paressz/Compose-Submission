package com.farez.composesubmission

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.farez.composesubmission.ui.components.BottomNavigationBar
import com.farez.composesubmission.ui.navigation.SetupNavigation
import com.farez.composesubmission.ui.theme.ComposeSubmissionTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeSubmissionTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    ThisApp()
                }
            }
        }
    }
}

@Composable
fun ThisApp(
    modifier : Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = {    BottomNavigationBar(navController) },
        modifier = modifier,
    ){
        SetupNavigation(navController = navController)
    }
}

@Preview
@Composable
fun AppPreview() {
    ThisApp()
}






