package com.grit.liferecorder
import com.grit.liferecorder.core.date.DateUtils; import org.junit.Assert.*; import org.junit.Test
class DateUtilsTest { @Test fun todayIsIsoDate(){ assertTrue(DateUtils.today().matches(Regex("\\d{4}-\\d{2}-\\d{2}"))) } }
