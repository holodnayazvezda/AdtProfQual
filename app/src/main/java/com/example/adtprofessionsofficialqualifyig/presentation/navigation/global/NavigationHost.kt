package com.example.adtprofessionsofficialqualifyig.presentation.navigation.global

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.adtprofessionsofficialqualifyig.presentation.screens.main.MainScreen

@Composable
fun NavigationHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String,
    bottomNavController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(AppDestinations.MAIN_SCREEN.route) {
            MainScreen(bottomNavController = bottomNavController)
        }
    }
}