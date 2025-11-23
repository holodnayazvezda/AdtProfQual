package com.example.adtprofessionsofficialqualifyig.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.R
import com.example.adtprofessionsofficialqualifyig.data.models.BottomNavigationItemModel
import com.example.adtprofessionsofficialqualifyig.presentation.theme.InterFontFamily

@Composable
fun BottomNavigationItem(
    bottomNavigationItemModel: BottomNavigationItemModel,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Column(
        Modifier.height(50.dp).clickable {
            onClick()
        },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(5.dp))
        Icon(
            painter = painterResource(if (isSelected) bottomNavigationItemModel.filledIconResId else bottomNavigationItemModel.outlinedIconResId),
            contentDescription = null,
            modifier = Modifier.size(22.dp)
        )
        Spacer(Modifier.height(5.dp))
        Text(
            text = bottomNavigationItemModel.text,
            fontSize = 10.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight(400),
            fontFamily = InterFontFamily
        )
    }
}