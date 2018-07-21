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
import android.media.MediaPlayer
import android.support.v7.app.AlertDialog
import android.view.View
import kotlinx.coroutines.experimental.launch


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
    private lateinit var mpValid: MediaPlayer
    private lateinit var mpInvalid: MediaPlayer
    private lateinit var mpSuccess: MediaPlayer

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

        mpValid = MediaPlayer.create(applicationContext, R.raw.valid)
        mpSuccess = MediaPlayer.create(applicationContext, R.raw.success)
        mpInvalid = MediaPlayer.create(applicationContext, R.raw.invalid)
    }

    override fun onResume() {
        super.onResume()

        presenter.start()
        presenter.startTicker()
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

    override fun playValid() {
        launch {
            mpValid.start()
        }
    }

    override fun playInvalid() {
        launch {
            mpInvalid.start()
        }
    }

    override fun playSuccess() {
        launch {
            mpSuccess.start()
        }
    }

    override fun showGameOver(time: Int) {
        runOnUiThread {
            setTimerVisibility(false)
            AlertDialog.Builder(this)
                    .setCancelable(false)
                    .setTitle("Игра окончена")
                    .setMessage("Вы продержались $time секунд")
                    .setPositiveButton("Еще раз", { dialog, _ ->
                        dialog.dismiss()
                        presenter.restartTime()
                        presenter.start()
                        setTimerVisibility(true)
                    })
                    .show()
        }
    }

    override fun setTimerVisibility(visible: Boolean) {
        timeTextView.visibility = if (visible) View.VISIBLE else View.GONE
    }
}
