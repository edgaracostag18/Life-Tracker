package com.grit.liferecorder.util
import android.content.Context; import android.net.Uri; import java.io.File
object ImageStorage { fun copyJournalPhoto(context:Context, uri:Uri):String{ val dir=File(context.filesDir,"journal_photos").also{it.mkdirs()}; val file=File(dir,"journal_${System.currentTimeMillis()}.jpg"); context.contentResolver.openInputStream(uri)?.use{input->file.outputStream().use{input.copyTo(it)}}; return file.absolutePath } }
