package com.luigivampa92.yms.timekiller.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.luigivampa92.yms.timekiller.model.entity.Letter

class FieldRecyclerViewAdapter(
        private val onItemClick: (Letter) -> Unit
) : RecyclerView.Adapter<LetterViewHolder>() {

    private val items: ArrayList<Letter> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = LetterViewHolder(LayoutInflater.from(parent.context), parent, onItemClick)

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun showField(field: List<Letter>) {
        items.clear()
        items.addAll(field)
        notifyDataSetChanged()
    }
}