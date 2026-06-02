package com.grit.liferecorder.domain.journal
import com.grit.liferecorder.data.local.entity.JournalEntryEntity; import com.grit.liferecorder.data.repository.JournalRepository
typealias JournalEntry = JournalEntryEntity
class SaveJournalEntryUseCase(private val repository:JournalRepository){ suspend operator fun invoke(date:String,note:String?,photoPath:String?=null)=repository.save(date,note,photoPath) }
