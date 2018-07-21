package com.luigivampa92.yms.timekiller.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import butterknife.BindView
import butterknife.ButterKnife
import com.arellomobile.mvp.presenter.InjectPresenter
import com.luigivampa92.yms.timekiller.R
import com.luigivampa92.yms.timekiller.model.entity.Letter
import com.luigivampa92.yms.timekiller.ui.base.BaseActivity
import javax.inject.Inject
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast


class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var app : Context

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @BindView(R.id.recycler_view_word)
    protected lateinit var recyclerViewWord: RecyclerView
    @BindView(R.id.recycler_view_field)
    protected lateinit var recyclerViewField: RecyclerView
    @BindView(R.id.toolbar)
    protected lateinit var toolbar: Toolbar

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

        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_result -> {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
            else -> {
            }
        }

        return true
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
}
