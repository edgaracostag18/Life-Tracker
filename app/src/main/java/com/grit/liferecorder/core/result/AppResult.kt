package com.grit.liferecorder.core.result
sealed class AppResult<out T>{ data class Success<T>(val value:T):AppResult<T>(); data class Error(val message:String):AppResult<Nothing>() }
