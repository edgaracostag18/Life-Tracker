package com.grit.liferecorder.ui.theme
import androidx.compose.material3.*; import androidx.compose.runtime.Composable; import androidx.compose.ui.graphics.Color
private val Scheme=darkColorScheme(primary=GritAccent,background=GritBg,surface=GritSurface,surfaceVariant=GritCard,onPrimary=Color(0xFF0E1111),onBackground=Color(0xFFE7E9EA),onSurface=Color(0xFFE7E9EA))
@Composable fun GritTheme(content:@Composable()->Unit){ MaterialTheme(colorScheme=Scheme,typography=GritTypography,content=content) }
