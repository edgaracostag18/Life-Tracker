package com.grit.liferecorder.ui.stats
import androidx.lifecycle.*; import com.grit.liferecorder.data.repository.*; import kotlinx.coroutines.flow.*
data class StatsUiState(val range:String="This month", val summary:StatsSummary=StatsSummary())
class StatsViewModel(private val repository:StatsRepository):ViewModel(){ private val range=MutableStateFlow("This month"); val state=range.flatMapLatest{r->repository.observe(r).map{StatsUiState(r,it)}}.stateIn(viewModelScope,SharingStarted.WhileSubscribed(5000),StatsUiState()); fun setRange(r:String){range.value=r} }
