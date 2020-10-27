package com.natlus.fallguyscounter.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.natlus.fallguyscounter.models.Score

class ScoreViewModel : ViewModel() {
    private var scoresMutableLiveData: MutableLiveData<Score> = MutableLiveData<Score>()
    private var score = Score()
    val scoreLiveData: LiveData<Score>
        get() = scoresMutableLiveData

    fun addScoreFall() {
        score.fallScore += 1
        scoresMutableLiveData.value = score
    }

    fun addScoreCrown() {
        score.crownScore += 1
        scoresMutableLiveData.value = score
    }

    fun resetFallCrown() {
        score.crownScore = 0
        score.fallScore = 0
        scoresMutableLiveData.value = score
    }
}