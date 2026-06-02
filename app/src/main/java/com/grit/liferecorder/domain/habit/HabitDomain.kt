package com.grit.liferecorder.domain.habit
import com.grit.liferecorder.data.local.entity.*; import com.grit.liferecorder.data.repository.HabitRepository
typealias TrackedAction = TrackedActionEntity; typealias ActionLog = ActionLogEntity
class LogActionUseCase(private val repository:HabitRepository){ suspend operator fun invoke(action:TrackedActionEntity,label:String=action.defaultLabel,note:String?=null)=repository.log(action,label,note) }
class GetActionLogsForDateUseCase(private val repository:HabitRepository){ operator fun invoke(date:String)=repository.observeLogsForDate(date) }
