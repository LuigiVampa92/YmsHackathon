package com.luigivampa92.yms.timekiller.ui.main

import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.luigivampa92.yms.timekiller.R
import com.luigivampa92.yms.timekiller.model.entity.Letter

class WordLetterViewHolder (
        inflater: LayoutInflater,
        container: ViewGroup,
        private val onClickListener: (Letter) -> Unit
) : RecyclerView.ViewHolder(inflater.inflate(R.layout.item_letter, container, false)) {

    init {
        ButterKnife.bind(this, itemView)
    }

    @BindView(R.id.letter_char)
    protected lateinit var textViewChar: TextView

    private lateinit var item: Letter

    fun bind(letter: Letter) {
        item = letter
        textViewChar.text = letter.char.toString()
        val color: Int = if (!letter.isEmpty) ContextCompat.getColor(itemView.context, R.color.color_filled) else ContextCompat.getColor(itemView.context, R.color.color_unfilled)
        textViewChar.setTextColor(color)

        itemView.visibility = View.VISIBLE
    }
}