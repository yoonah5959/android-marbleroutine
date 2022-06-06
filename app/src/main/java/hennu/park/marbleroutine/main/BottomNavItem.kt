package hennu.park.marbleroutine.main

import hennu.park.marbleroutine.R

const val CALENDAR = "CALENDAR"
const val HOME = "HOME"
const val PLUS = "PLUS"

sealed class BottomNavItem(
    val title: Int, val icon: Int, val screenRoute: String
) {
    object Home : BottomNavItem(R.string.home, R.drawable.ic_home, HOME)
    object Plus : BottomNavItem(R.string.plus, R.drawable.ic_plus, PLUS)
    object Calendar : BottomNavItem(R.string.calendar, R.drawable.ic_calendar, CALENDAR)
}