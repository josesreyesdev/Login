package com.jsrdev.loginflow.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.jsrdev.loginflow.navigation.PostOfficeAppRouter
import com.jsrdev.loginflow.navigation.Screen
import com.jsrdev.loginflow.screens.SignUpScreen
import com.jsrdev.loginflow.screens.TermsAndConditionsScreen

@Composable
fun PostOfficeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        Crossfade(targetState = PostOfficeAppRouter.currentScreen, label = "") { currentState ->
            when(currentState.value) {
                is Screen.SignUpScreen -> SignUpScreen()
                is Screen.TermsAndConditionsScreen -> TermsAndConditionsScreen()
            }
        }
    }
}