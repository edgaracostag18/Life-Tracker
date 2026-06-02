package com.grit.liferecorder.ui.navigation
sealed class Screen(val route:String,val label:String){ data object Calendar:Screen("calendar","Calendar"); data object Tasks:Screen("tasks","Tasks"); data object Habits:Screen("habits","Habits"); data object Routines:Screen("routines","Routines"); data object Stats:Screen("stats","Stats") }
val bottomScreens=listOf(Screen.Calendar,Screen.Tasks,Screen.Habits,Screen.Routines,Screen.Stats)
