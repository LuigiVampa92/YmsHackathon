package com.luigivampa92.yms.timekiller.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.luigivampa92.yms.timekiller.R
import com.luigivampa92.yms.timekiller.model.GamePreferencesImpl

class ResultActivity : AppCompatActivity() {

    @BindView(R.id.best_result_value)
    lateinit var bestResult:TextView
    @BindView(R.id.toolbar)
    lateinit var toolbar: Toolbar
    @BindView(R.id.time_text_view)
    lateinit var timeText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        ButterKnife.bind(this)
        bestResult.text = GamePreferencesImpl(this).getBestResult()
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        timeText.visibility = View.GONE
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}