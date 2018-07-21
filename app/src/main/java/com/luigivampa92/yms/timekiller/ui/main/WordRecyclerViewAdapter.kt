package com.luigivampa92.yms.timekiller.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.luigivampa92.yms.timekiller.model.entity.Letter

class WordRecyclerViewAdapter(
        private val onItemClick: (Letter) -> Unit
) : RecyclerView.Adapter<WordLetterViewHolder>() {

    private val items: ArrayList<Letter> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = WordLetterViewHolder(LayoutInflater.from(parent.context), parent, onItemClick)

    override fun onBindViewHolder(holder: WordLetterViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun setItems(letters: List<Letter>) {
        items.clear()
        items.addAll(letters)
        notifyDataSetChanged()
    }
}