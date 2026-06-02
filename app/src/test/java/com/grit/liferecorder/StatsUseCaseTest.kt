package com.grit.liferecorder
import com.grit.liferecorder.data.repository.StatsSummary; import org.junit.Assert.*; import org.junit.Test
class StatsUseCaseTest { @Test fun emptyStatsAreZero(){ assertEquals(0, StatsSummary().totalTasks) } }
