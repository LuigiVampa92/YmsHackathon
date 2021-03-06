package com.luigivampa92.yms.timekiller.ui.main

import com.arellomobile.mvp.MvpView
import com.luigivampa92.yms.timekiller.model.entity.Letter

interface MainView : MvpView {
    fun setWord(letter: List<Letter>)
    fun setField(field: List<Letter>)
    fun setTime(time: Int)
    fun playValid()
    fun playInvalid()
    fun playSuccess()
    fun showGameOver(time: Int)
    fun setTimerVisibility(visible: Boolean)
}