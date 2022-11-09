package com.ramanie.jetpacknavdrawer

import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

@Composable
fun AppBar( onNavIconClicked: () -> Unit ) {
    TopAppBar( title = {
        Text(text = stringResource(id = R.string.app_name))
    }, backgroundColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary,
        navigationIcon = { IconButton(onClick = onNavIconClicked) {
            Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Toggle navigation drawer"
        ) } })
}