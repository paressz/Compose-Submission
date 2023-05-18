package com.farez.composesubmission.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.farez.composesubmission.ui.navigation.NavItem
import com.farez.composesubmission.ui.navigation.Screen

@Composable
fun BottomNavigationBar (navController : NavHostController, modifier: Modifier = Modifier) {
    BottomNavigation(modifier = modifier) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navItem = listOf(
            NavItem(
                "Home",
                Icons.Default.Home,
                Screen.Home,
                "Home page"
            ),
            NavItem(
                "About",
                Icons.Rounded.Person,
                Screen.About,
                "About_page"
            )
        )
        BottomNavigation {
            navItem.map {
                BottomNavigationItem(
                    icon = {
                        Icon(imageVector = it.icon, contentDescription = it.desc)
                    },
                    label = { Text(text = it.title)},
                    selected = currentRoute == it.screen.route,
                    onClick = {
                        navController.navigate(it.screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true
                        }
                    },
                )
            }
        }
    }
}