package com.example.adtprofessionsofficialqualifyig.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.adtprofessionsofficialqualifyig.presentation.navigation.global.AppDestinations
import com.example.adtprofessionsofficialqualifyig.presentation.navigation.global.NavigationHost
import com.example.adtprofessionsofficialqualifyig.presentation.theme.ADTProfessionsOfficialQualifyigTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ADTProfessionsOfficialQualifyigTheme {
                NavigationHost(
                    navController = rememberNavController(),
                    startDestination = AppDestinations.MAIN_SCREEN.route
                )
            }
        }
    }
}