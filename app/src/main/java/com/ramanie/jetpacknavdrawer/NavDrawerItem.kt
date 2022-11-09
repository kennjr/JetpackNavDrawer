package com.ramanie.jetpacknavdrawer

import androidx.compose.ui.graphics.vector.ImageVector

data class NavDrawerItem(
    val title: String,
    val id: String,
    val contentDescription: String,
    val icon: ImageVector
)
