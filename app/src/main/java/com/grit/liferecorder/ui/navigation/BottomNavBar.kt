package com.grit.liferecorder.ui.navigation
import androidx.compose.material3.*; import androidx.compose.runtime.Composable
@Composable fun BottomNavBar(current:String,onSelect:(Screen)->Unit){ NavigationBar{ bottomScreens.forEach{ s-> NavigationBarItem(selected=current==s.route,onClick={onSelect(s)},icon={Text(s.label.first().toString())},label={Text(s.label)}) } } }
