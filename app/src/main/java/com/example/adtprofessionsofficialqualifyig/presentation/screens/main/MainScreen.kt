package com.example.adtprofessionsofficialqualifyig.presentation.screens.main

import android.media.MediaPlayer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.example.adtprofessionsofficialqualifyig.R
import com.example.adtprofessionsofficialqualifyig.presentation.components.BottomNavigationBar
import com.example.adtprofessionsofficialqualifyig.presentation.navigation.bottom.BottomNavDestinations
import com.example.adtprofessionsofficialqualifyig.presentation.navigation.bottom.BottomNavigationHost
import org.koin.androidx.compose.koinViewModel

@Composable
fun MainScreen(
    viewModel: MainScreenViewModel = koinViewModel(),
    bottomNavController: NavHostController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNavigationBar(bottomNavController)
        }
    ) { paddingValues ->
        BottomNavigationHost(
            modifier = Modifier.padding(paddingValues),
            bottomNavController = bottomNavController,
            startDestination = BottomNavDestinations.HOME.route
        )
    }
//    val context = LocalContext.current
//    val mediaPlayer = remember { MediaPlayer.create(context, R.raw.judenmusic) }
//    LaunchedEffect(Unit) {
//        mediaPlayer.start()
//    }
}