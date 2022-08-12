package com.nbgsoftware.myinstagram.ui.custom

import androidx.compose.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

/**
 * bottom_nav_jetpack_compose_graph
 * */
@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen()
        }
        composable(BottomNavItem.Search.screen_route) {
            SearchScreen()
        }
        composable(BottomNavItem.Reels.screen_route) {
            ReelsScreen()
        }
        composable(BottomNavItem.Notification.screen_route) {
            NotificationScreen()
        }
        composable(BottomNavItem.Personal.screen_route) {
            PersonalScreen()
        }
    }
}