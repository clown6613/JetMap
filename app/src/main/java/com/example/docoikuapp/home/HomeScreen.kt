package com.example.docoikuapp.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "ホーム")
                }
            )
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Text(text = "近くの飲食店を探す")
            
        }
    }
}
