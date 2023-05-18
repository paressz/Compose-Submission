package com.farez.composesubmission.ui.navigation

sealed class Screen (val route : String){
    object Home : Screen("homescreen")
    object Detail : Screen("detailscreen/{itemId}") {
        fun createRoute  (itemId : String) = "detailscreen/$itemId"
    }
    object About : Screen("aboutscreen")
}
