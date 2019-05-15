package com.fiqih.restorantq.ui.viewholder

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.fiqih.restorantq.R
import com.fiqih.restorantq.model.Kategori
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_cardview_kategori.view.*

class KoleksiTerpilihViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.item_cardview_kategori, parent, false)){

    private var imgKategori = itemView.ivkategori
    private var tvKategori: TextView? = null
    private var tvOutlet: TextView? = null
    private var tvDesk: TextView? = null

    init {
        tvKategori = itemView.findViewById(R.id.tvkategori)
        tvOutlet = itemView.findViewById(R.id.tvjumlahoutlet)
        tvDesk = itemView.findViewById(R.id.tvdeskripsi)
    }

    fun bind(kategori: Kategori, clickListener: (Kategori) -> Unit) {

        Log.i("error gambar : ", kategori.img_kategori)
        Picasso.get().load(kategori.img_kategori)
            .placeholder(R.drawable.background_image_placeholder)
            .error(R.drawable.background_image_placeholder)
            .into(imgKategori)
        tvKategori?.text = kategori.kategori
        tvOutlet?.text = kategori.jml_outlet.toString()+" Outlet, Disimpan"+kategori.jml_disimpan.toString()+" Kali"
        tvDesk?.text = kategori.deskripsi

        itemView.setOnClickListener { clickListener(kategori)}
    }
}