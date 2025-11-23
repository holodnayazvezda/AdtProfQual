package com.example.adtprofessionsofficialqualifyig.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.adtprofessionsofficialqualifyig.R

val InterFontFamily = FontFamily(
    Font(
        R.font.inter,
        FontWeight.Normal,
        FontStyle.Normal
    )
)

val Typography = Typography(
    labelMedium = TextStyle(
        fontFamily = InterFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
//        lineHeight = 24.sp,
//        letterSpacing = 0.15.sp
    )
)