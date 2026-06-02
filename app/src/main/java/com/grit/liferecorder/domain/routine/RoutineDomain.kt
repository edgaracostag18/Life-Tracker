package com.grit.liferecorder.domain.routine
import com.grit.liferecorder.data.local.entity.*; import com.grit.liferecorder.data.repository.RoutineRepository
typealias Routine = RoutineEntity; typealias RoutineStep = RoutineStepEntity; typealias RoutineOccurrence = RoutineOccurrenceEntity
class CompleteRoutineUseCase(private val repository:RoutineRepository){ suspend operator fun invoke(routine:RoutineEntity)=repository.completeToday(routine) }
class SkipRoutineUseCase(private val repository:RoutineRepository){ suspend operator fun invoke(routine:RoutineEntity)=repository.skipToday(routine) }
class MarkMissedRoutinesUseCase(private val repository:RoutineRepository){ suspend operator fun invoke()=repository.markMissedThrough() }
