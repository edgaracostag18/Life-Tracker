package com.grit.liferecorder
import com.grit.liferecorder.data.local.entity.TrackedActionEntity; import org.junit.Assert.*; import org.junit.Test
class HabitUseCaseTest { @Test fun defaultLabelCanBeNeutral(){ assertEquals("Neutral", TrackedActionEntity(name="Eating out",createdAt=1,updatedAt=1).defaultLabel) } }
