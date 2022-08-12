package com.nbgsoftware.myinstagram.ui.custom

import com.nbgsoftware.myinstagram.R

/**
 * bottom_nav_jetpack_compose_item
 * */
sealed class BottomNavItem(var title: String, var icon: Int, var screen_route: String) {

    object Home : BottomNavItem("Home", R.drawable.ic_create, "home")
    object Search : BottomNavItem("Search", R.drawable.ic_create, "search")
    object Reels : BottomNavItem("Reels", R.drawable.ic_create, "reels")
    object Notification : BottomNavItem("Notification", R.drawable.ic_create, "notification")
    object Personal : BottomNavItem("Personal", R.drawable.ic_create, "personal")
}
