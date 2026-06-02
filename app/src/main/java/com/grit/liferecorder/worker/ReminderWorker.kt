package com.grit.liferecorder.worker
import android.content.Context; import androidx.work.*
class ReminderWorker(appContext:Context, params:WorkerParameters):CoroutineWorker(appContext,params){ override suspend fun doWork():Result = Result.success() }
