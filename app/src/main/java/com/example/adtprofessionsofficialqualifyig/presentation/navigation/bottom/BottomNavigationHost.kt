package com.example.adtprofessionsofficialqualifyig.presentation.navigation.bottom

import androidx.compose.foundation.magnifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.adtprofessionsofficialqualifyig.presentation.screens.main.bottom_navigation.DiscoverScreen
import com.example.adtprofessionsofficialqualifyig.presentation.screens.main.bottom_navigation.HomeScreen
import com.example.adtprofessionsofficialqualifyig.presentation.screens.main.bottom_navigation.InboxScreen
import com.example.adtprofessionsofficialqualifyig.presentation.screens.main.bottom_navigation.MeScreen

@Composable
fun BottomNavigationHost(
    modifier: Modifier,
    bottomNavController: NavHostController,
    startDestination: String
) {
    NavHost(
        modifier = modifier,
        navController = bottomNavController,
        startDestination = startDestination
    ) {
        composable(BottomNavDestinations.HOME.route) {
            HomeScreen()
        }
        composable(BottomNavDestinations.DISCOVER.route) {
            DiscoverScreen()
        }
        composable(BottomNavDestinations.INBOX.route) {
            InboxScreen()
        }
        composable(BottomNavDestinations.ME.route) {
            MeScreen()
        }
    }
}