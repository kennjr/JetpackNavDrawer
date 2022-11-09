package com.ramanie.jetpacknavdrawer

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DrawerBody( navItems: List<NavDrawerItem>,
                modifier: Modifier = Modifier,
                itemTextStyle: TextStyle = TextStyle(fontSize = 18.sp),
                itemClickEvent: (NavDrawerItem) -> Unit) {
    LazyColumn(modifier = modifier){
        items(navItems){ item ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .clickable { itemClickEvent(item) }
                .padding(16.dp)) {
                Icon(imageVector = item.icon,
                    contentDescription = item.contentDescription)
                Spacer(modifier = Modifier.fillMaxWidth(0.1f))
                Text(text = item.title,
                    style = itemTextStyle,
                    // the weight modifier will allow the text to occupy the rest of the width in the row
                    modifier = Modifier.weight(1f))
            }
        }
    }
}