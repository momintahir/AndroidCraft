package com.momin.androidcraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.momin.androidcraft.ui.theme.AndroidCraftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCraftTheme {
                // A surface container using the 'background' color from the theme
            }
        }
    }
}