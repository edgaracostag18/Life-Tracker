package com.grit.liferecorder.worker
import android.content.Context; import androidx.work.*; import com.grit.liferecorder.core.constants.AppConstants; import java.util.concurrent.TimeUnit
object WorkScheduler { fun scheduleMissedRoutineCheck(context:Context){ val request=PeriodicWorkRequestBuilder<MissedRoutineWorker>(1,TimeUnit.DAYS).setConstraints(Constraints.Builder().setRequiresBatteryNotLow(false).build()).build(); WorkManager.getInstance(context).enqueueUniquePeriodicWork(AppConstants.MISSED_ROUTINE_WORK,ExistingPeriodicWorkPolicy.UPDATE,request) } }
