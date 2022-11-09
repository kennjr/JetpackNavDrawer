package com.ramanie.jetpacknavdrawer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerHeader() {
    // In here is where we'll have composable code for the drawerHeader
    Box(modifier = Modifier
        .background(Color.Gray)
        .fillMaxWidth()
        .padding(64.dp), contentAlignment = Alignment.Center){
        Text(text = "Nav Drawer header", fontSize = 20.sp)
    }
    
}