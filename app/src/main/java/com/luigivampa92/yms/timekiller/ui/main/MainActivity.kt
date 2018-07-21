package com.luigivampa92.yms.timekiller.ui.main

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.arellomobile.mvp.presenter.InjectPresenter
import com.luigivampa92.yms.timekiller.R
import com.luigivampa92.yms.timekiller.model.entity.Letter
import com.luigivampa92.yms.timekiller.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var app : Context

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @BindView(R.id.recycler_view_word)
    protected lateinit var recyclerViewWord: RecyclerView
    @BindView(R.id.recycler_view_field)
    protected lateinit var recyclerViewField: RecyclerView
    @BindView(R.id.time_text_view)
    protected lateinit var timeTextView: TextView

    private lateinit var wordAdapter: WordRecyclerViewAdapter
    private lateinit var wordLayoutManager: RecyclerView.LayoutManager
    private lateinit var fieldAdapter: FieldRecyclerViewAdapter
    private lateinit var fieldLayoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        wordAdapter = WordRecyclerViewAdapter(presenter::wordLetterClicked)
        wordLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewWord.adapter = wordAdapter
        recyclerViewWord.layoutManager = wordLayoutManager

        fieldAdapter = FieldRecyclerViewAdapter(presenter::fieldLetterClicked)
        fieldLayoutManager = GridLayoutManager(this, 8)
        recyclerViewField.adapter = fieldAdapter
        recyclerViewField.layoutManager = fieldLayoutManager
    }

    override fun onResume() {
        super.onResume()

        presenter.start()
    }

    override fun setWord(letter: List<Letter>) {
        wordAdapter.setItems(letter)
    }

    override fun setField(field: List<Letter>) {
        fieldAdapter.showField(field)
    }

    override fun setTime(time: Int) {
        runOnUiThread {
            timeTextView.text = time.toString()
        }
    }
}
