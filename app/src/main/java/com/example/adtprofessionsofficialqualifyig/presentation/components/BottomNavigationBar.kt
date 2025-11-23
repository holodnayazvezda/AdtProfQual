package com.example.adtprofessionsofficialqualifyig.presentation.components

import com.example.adtprofessionsofficialqualifyig.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.adtprofessionsofficialqualifyig.data.models.BottomNavigationItemModel
import com.example.adtprofessionsofficialqualifyig.presentation.navigation.bottom.BottomNavDestinations

@Composable
fun BottomNavigationBar(
    bottomNavController: NavHostController
) {
    var selectedRoute by remember { mutableStateOf(BottomNavDestinations.HOME.route) }
    Column(
        modifier = Modifier.fillMaxWidth().height(80.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().height(50.dp).padding(horizontal = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            BottomNavigationItem(
                bottomNavigationItemModel = BottomNavigationItemModel(
                    outlinedIconResId = R.drawable.home_outlined,
                    filledIconResId = R.drawable.home_filled,
                    text = "Home",
                    route = BottomNavDestinations.HOME.route
                ),
                isSelected = BottomNavDestinations.HOME.route == selectedRoute,
                onClick = {
                    selectedRoute = BottomNavDestinations.HOME.route
                    bottomNavController.navigate(BottomNavDestinations.HOME.route)
                }
            )
            BottomNavigationItem(
                bottomNavigationItemModel = BottomNavigationItemModel(
                    outlinedIconResId = R.drawable.search_outlined,
                    filledIconResId = R.drawable.search_outlined,
                    text = "Search",
                    route = BottomNavDestinations.DISCOVER.route
                ),
                isSelected = BottomNavDestinations.DISCOVER.route == selectedRoute,
                onClick = {
                    selectedRoute = BottomNavDestinations.DISCOVER.route
                    bottomNavController.navigate(BottomNavDestinations.DISCOVER.route)
                }
            )
            Icon(
                painter = painterResource(R.drawable.tiktok),
                contentDescription = null,
                modifier = Modifier.width(36.dp).height(28.dp),
                tint = Color.Unspecified
            )
            BottomNavigationItem(
                bottomNavigationItemModel = BottomNavigationItemModel(
                    outlinedIconResId = R.drawable.inbox_outlined,
                    filledIconResId = R.drawable.inbox_outlined,
                    text = "Inbox",
                    route = BottomNavDestinations.INBOX.route
                ),
                isSelected = BottomNavDestinations.INBOX.route == selectedRoute,
                onClick = {
                    selectedRoute = BottomNavDestinations.INBOX.route
                    bottomNavController.navigate(BottomNavDestinations.INBOX.route)
                }
            )
            BottomNavigationItem(
                bottomNavigationItemModel = BottomNavigationItemModel(
                    outlinedIconResId = R.drawable.me_oitlined,
                    filledIconResId = R.drawable.me_filled,
                    text = "Me",
                    route = BottomNavDestinations.ME.route
                ),
                isSelected = BottomNavDestinations.ME.route == selectedRoute,
                onClick = {
                    selectedRoute = BottomNavDestinations.ME.route
                    bottomNavController.navigate(BottomNavDestinations.ME.route)
                }
            )
        }
    }
}