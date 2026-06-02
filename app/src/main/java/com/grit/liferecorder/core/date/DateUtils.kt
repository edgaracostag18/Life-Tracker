package com.grit.liferecorder.core.date
import java.time.*; import java.time.format.DateTimeFormatter; import java.time.temporal.WeekFields; import java.util.Locale
object DateUtils {
    val iso: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE
    fun today(): String = LocalDate.now().format(iso)
    fun fromMillis(millis: Long): String = Instant.ofEpochMilli(millis).atZone(ZoneId.systemDefault()).toLocalDate().format(iso)
    fun millisForStartOfDay(localDate: String): Long = LocalDate.parse(localDate).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()
    fun display(localDate: String): String = LocalDate.parse(localDate).format(DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy"))
    fun monthTitle(yearMonth: YearMonth): String = yearMonth.format(DateTimeFormatter.ofPattern("MMMM yyyy"))
    fun weekBounds(): Pair<String,String> { val now=LocalDate.now(); val first=now.with(WeekFields.of(Locale.getDefault()).dayOfWeek(),1); return first.format(iso) to first.plusDays(6).format(iso) }
    fun monthBounds(): Pair<String,String> { val ym=YearMonth.now(); return ym.atDay(1).format(iso) to ym.atEndOfMonth().format(iso) }
}
