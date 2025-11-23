package com.example.adtprofessionsofficialqualifyig.data.models

data class TokenResponse(
    val accessToken: String,
    val refreshToken: String? = null
)
