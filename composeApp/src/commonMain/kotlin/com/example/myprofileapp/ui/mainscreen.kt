package com.example.myprofileapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.myprofileapp.navigation.AppNavGraph
import com.example.myprofileapp.navigation.Screen

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar {
                // Tombol Home
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, "Home") },
                    label = { Text("Home") },
                    selected = false,
                    onClick = { navController.navigate(Screen.Home.route) }
                )

                // Tombol Profile
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, "Profile") },
                    label = { Text("Profile") },
                    selected = false,
                    onClick = { navController.navigate(Screen.Profile.route) }
                )
            }
        }
    ) { padding ->
        Surface(modifier = Modifier.padding(padding)) {
            AppNavGraph(navController = navController)
        }
    }
}
