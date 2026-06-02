package com.grit.liferecorder.domain.task
import com.grit.liferecorder.data.local.entity.TaskEntity; import com.grit.liferecorder.data.repository.TaskRepository
typealias Task = TaskEntity
class CompleteTaskUseCase(private val repository:TaskRepository){ suspend operator fun invoke(task:TaskEntity)=repository.complete(task) }
class GetTasksForDateUseCase(private val repository:TaskRepository){ operator fun invoke(date:String)=repository.observeForDate(date) }
