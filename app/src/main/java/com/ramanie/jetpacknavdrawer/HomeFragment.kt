package com.ramanie.jetpacknavdrawer

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeFragment(){
    
    val navItems = listOf(
        NavDrawerItem(title = "Profile", id = "profile_item", contentDescription = "Profile navigation item", icon = Icons.Default.AccountBox),
        NavDrawerItem(title = "Settings", id = "settings_item", contentDescription = "Settings navigation item", icon = Icons.Default.Settings),
        NavDrawerItem(title = "Messages", id = "messages_item", contentDescription = "Messages navigation item", icon = Icons.Default.Email),
        NavDrawerItem(title = "Logout", id = "logout_item", contentDescription = "Logout navigation item", icon = Icons.Default.ExitToApp)
    )
    // we need this scope for us to open the drawer
    val scope = rememberCoroutineScope()
    val ctx = LocalContext.current
    // this is what will let us toggle the drawer's visibility
    val scaffoldState = rememberScaffoldState()

    // we use the scaffold to pass the typical UI components like toolbar, bottomnav, etc
    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.fillMaxSize(),
        topBar = {
            AppBar(onNavIconClicked = {
                // the code that'll get executed when the user clicks on the hamburger icon
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            })
        },
        drawerShape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp),
        // this will let the user swipe the drawer away
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            DrawerHeader()
            DrawerBody(
                navItems = navItems,
                itemClickEvent = { navDrawerItem: NavDrawerItem ->
                    Toast.makeText(ctx, navDrawerItem.title, Toast.LENGTH_SHORT).show()
                }
            )
        }){}
}