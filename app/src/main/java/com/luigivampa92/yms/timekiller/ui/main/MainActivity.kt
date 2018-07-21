package com.luigivampa92.yms.timekiller.ui.main

import android.content.Context
import android.os.Bundle
import com.arellomobile.mvp.presenter.InjectPresenter
import com.luigivampa92.yms.timekiller.R
import com.luigivampa92.yms.timekiller.model.entity.GameField
import com.luigivampa92.yms.timekiller.model.entity.Letter
import com.luigivampa92.yms.timekiller.ui.base.BaseActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var app : Context

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setWord(letter: List<Letter>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setField(field: GameField) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
