package com.fiqih.restorantq.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.fiqih.restorantq.model.DetailKategori
import com.fiqih.restorantq.ui.viewholder.DetailKategoriViewHolder

class DetailKategoriAdapter(private val list: List<DetailKategori>, val clickListener: (DetailKategori) -> Unit): RecyclerView.Adapter<DetailKategoriViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailKategoriViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return DetailKategoriViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: DetailKategoriViewHolder, position: Int) {
        val detailKategori: DetailKategori = list[position]
        holder.bind(detailKategori, clickListener)
    }

    override fun getItemCount(): Int = list.size

}