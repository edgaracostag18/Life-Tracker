package com.grit.liferecorder
import android.os.Bundle; import androidx.activity.ComponentActivity; import androidx.activity.compose.setContent; import com.grit.liferecorder.ui.navigation.AppNavHost; import com.grit.liferecorder.ui.theme.GritTheme
class MainActivity:ComponentActivity(){ override fun onCreate(savedInstanceState:Bundle?){ super.onCreate(savedInstanceState); val c=(application as GritApp).container; setContent{ GritTheme{ AppNavHost(c) } } } }
