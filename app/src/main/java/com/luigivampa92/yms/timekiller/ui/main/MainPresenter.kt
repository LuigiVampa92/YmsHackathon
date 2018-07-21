package com.luigivampa92.yms.timekiller.ui.main

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    fun testPresenter() {
        viewState.test()
    }
}