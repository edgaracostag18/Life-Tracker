package com.grit.liferecorder
import com.grit.liferecorder.data.local.entity.RoutineEntity; import org.junit.Assert.*; import org.junit.Test
class RoutineUseCaseTest { @Test fun routineRequiresScheduledDays(){ assertTrue(RoutineEntity(name="Morning",scheduledDays="MON",createdAt=1,updatedAt=1).scheduledDays.isNotBlank()) } }
