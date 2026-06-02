package com.grit.liferecorder.core.date
import java.time.*; import java.time.format.DateTimeFormatter
object TimeUtils { fun now(): Long = System.currentTimeMillis(); fun displayTime(millis: Long): String = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalTime().format(DateTimeFormatter.ofPattern("h:mm a")) }
