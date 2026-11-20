package com.example.shedule_kbk.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shedule_kbk.ui.auth.LoginScreen
import com.example.shedule_kbk.ui.auth.RegisterScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(
                onLoginClick = {
                    // Авторизацию подключим позже
                },
                onRegisterClick = {
                    navController.navigate("register")
                }
            )
        }

        composable("register") {
            RegisterScreen(
                onRegisterClick = {
                    // Регистрацию подключим позже
                },
                onLoginClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}