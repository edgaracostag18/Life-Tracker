package com.grit.liferecorder.util
object PermissionUtils { fun notificationsPermissionRequired() = android.os.Build.VERSION.SDK_INT >= 33 }
