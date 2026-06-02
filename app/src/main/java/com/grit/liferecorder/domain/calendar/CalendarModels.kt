package com.grit.liferecorder.domain.calendar
import com.grit.liferecorder.core.model.CalendarDotType; import com.grit.liferecorder.data.repository.CalendarRepository; import java.time.YearMonth
data class CalendarDot(val type:CalendarDotType)
data class CalendarDaySummary(val localDate:String,val dots:List<CalendarDot>)
class GetCalendarMonthUseCase(private val repository:CalendarRepository){ operator fun invoke(month:YearMonth)=repository.observeMonth(month) }
