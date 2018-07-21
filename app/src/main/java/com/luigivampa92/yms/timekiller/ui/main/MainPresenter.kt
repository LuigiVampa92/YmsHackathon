package com.luigivampa92.yms.timekiller.ui.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.luigivampa92.yms.timekiller.model.entity.Letter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    fun testWord() {
        val l1 = Letter('A', true)
        val l2 = Letter('B', true)
        val l3 = Letter('C', true)
        val l4 = Letter('D', true)

        viewState.setWord(listOf(l1, l2, l3, l4))
    }
}