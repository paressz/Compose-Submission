package com.farez.composesubmission.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.farez.composesubmission.ui.screen.AboutScreen
import com.farez.composesubmission.ui.screen.DetailScreen
import com.farez.composesubmission.ui.screen.HomeScreen

@Composable
fun SetupNavigation(
    navController : NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navigateTODetail = {
                navController.navigate(Screen.Detail.createRoute(it))
            })
        }
         composable(
             route = Screen.Detail.route,
             arguments = listOf(navArgument("itemId"){type = NavType.StringType})
         ) {
             val id = it.arguments?.getString("itemId")
             DetailScreen(messengerId = id)
         }
        composable(
            route = Screen.About.route,
        ) {
            AboutScreen()
        }
    }
}