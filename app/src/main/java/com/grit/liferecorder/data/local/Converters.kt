package com.grit.liferecorder.data.local
import androidx.room.TypeConverter
class Converters { @TypeConverter fun noop(value:String?):String?=value }
