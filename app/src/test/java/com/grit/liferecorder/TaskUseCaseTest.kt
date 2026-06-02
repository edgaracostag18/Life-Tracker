package com.grit.liferecorder
import com.grit.liferecorder.data.local.entity.TaskEntity; import org.junit.Assert.*; import org.junit.Test
class TaskUseCaseTest { @Test fun taskTitleRequiredConcept(){ val title="Call client"; assertTrue(title.isNotBlank()); assertEquals("Open", TaskEntity(title=title,createdAt=1,updatedAt=1).status) } }
