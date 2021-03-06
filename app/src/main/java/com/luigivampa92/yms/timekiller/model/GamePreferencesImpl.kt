package com.luigivampa92.yms.timekiller.model

import android.content.Context
import android.preference.PreferenceManager.getDefaultSharedPreferences

class GamePreferencesImpl (context: Context):GamePreferences {

    private var prefs = getDefaultSharedPreferences(context)
    private val currDiffKey = "currentDifficulty"
    private val bestResultKey = "bestResult"
    private val defaultDifficulty = 1

    override fun getCurrentDifficultyLevel(): Int {
        return this.prefs.getInt(this.currDiffKey, this.defaultDifficulty)
    }

    override fun setCurrentDifficultyLevel(currentLevel: Int) {
        val editor = this.prefs.edit()
        editor.putInt(this.currDiffKey, currentLevel)
        editor.apply()
    }

    override fun getBestResult(): String {
        return this.prefs.getString(this.bestResultKey, "Пока нет")
    }

    override fun setBestResult(result: String) {
        val editor = this.prefs.edit()
        editor.putString(this.bestResultKey, result)
        editor.apply()
    }
}