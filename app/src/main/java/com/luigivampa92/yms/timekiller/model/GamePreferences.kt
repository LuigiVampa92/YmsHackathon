package com.luigivampa92.yms.timekiller.model

interface GamePreferences {
    fun getCurrentDifficultyLevel() : Int
    fun setCurrentDifficultyLevel(currentLevel: Int)
    fun getBestResult(): String
    fun setBestResult(result: String)
}