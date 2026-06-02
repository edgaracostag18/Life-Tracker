package com.grit.liferecorder.ui.components
import androidx.compose.foundation.layout.*; import androidx.compose.material3.*; import androidx.compose.runtime.Composable; import androidx.compose.ui.Modifier; import com.grit.liferecorder.ui.navigation.*
@Composable fun AppScaffold(current:String,onSelect:(Screen)->Unit,content:@Composable PaddingValues.()->Unit){ Scaffold(bottomBar={BottomNavBar(current,onSelect)}){ padding-> content(padding) } }
