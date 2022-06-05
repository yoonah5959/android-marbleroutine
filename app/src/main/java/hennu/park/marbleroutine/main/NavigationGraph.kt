package hennu.park.marbleroutine.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import hennu.park.marbleroutine.main.screen.CalendarScreen
import hennu.park.marbleroutine.main.screen.HomeScreen
import hennu.park.marbleroutine.main.screen.PlusScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomNavItem.Calendar.screenRoute) {
        composable(BottomNavItem.Home.screenRoute) {
            HomeScreen()
        }
        composable(BottomNavItem.Plus.screenRoute) {
            PlusScreen()
        }
        composable(BottomNavItem.Calendar.screenRoute) {
            CalendarScreen()
        }
    }
}