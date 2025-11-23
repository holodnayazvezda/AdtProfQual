package com.example.adtprofessionsofficialqualifyig.presentation.screens.main

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.adtprofessionsofficialqualifyig.R
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class MainScreenViewModel(
    private val context: Context
): ViewModel() {
    private var player: MediaPlayer? = null

    init {
        viewModelScope.launch {
            startMusic()
        }
    }

    private fun startMusic() {
        player = MediaPlayer.create(context, R.raw.judenmusic)
        player?.isLooping = true
        player?.start()
    }

    override fun onCleared() {
        super.onCleared()
        player?.release()
        player = null
    }
}
