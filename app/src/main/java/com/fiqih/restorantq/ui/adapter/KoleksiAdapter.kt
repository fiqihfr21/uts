package com.fiqih.restorantq.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.fiqih.restorantq.model.Kategori
import com.fiqih.restorantq.ui.viewholder.KoleksiTerpilihViewHolder

class KoleksiAdapter(private val list: List<Kategori>, val clickListener: (Kategori) -> Unit): RecyclerView.Adapter<KoleksiTerpilihViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KoleksiTerpilihViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return KoleksiTerpilihViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: KoleksiTerpilihViewHolder, position: Int) {
        val kategori: Kategori = list[position]
        holder.bind(kategori, clickListener)
    }

    override fun getItemCount(): Int = list.size

}