package com.farez.composesubmission.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val title : String,
    val icon : ImageVector,
    val screen: Screen,
    val desc : String
)
