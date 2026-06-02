package com.grit.liferecorder.domain.stats
import com.grit.liferecorder.data.repository.StatsRepository; typealias StatsSummary = com.grit.liferecorder.data.repository.StatsSummary
class GetStatsUseCase(private val repository:StatsRepository){ operator fun invoke(range:String)=repository.observe(range) }
