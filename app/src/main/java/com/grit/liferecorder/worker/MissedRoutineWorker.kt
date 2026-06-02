package com.grit.liferecorder.worker
import android.content.Context; import androidx.work.*; import com.grit.liferecorder.data.local.GritDatabase; import com.grit.liferecorder.data.repository.RoutineRepository
class MissedRoutineWorker(appContext:Context, params:WorkerParameters):CoroutineWorker(appContext,params){ override suspend fun doWork():Result{ val db=GritDatabase.get(applicationContext); RoutineRepository(db.routineDao(),db.routineStepDao(),db.routineOccurrenceDao()).markMissedThrough(); return Result.success() } }
