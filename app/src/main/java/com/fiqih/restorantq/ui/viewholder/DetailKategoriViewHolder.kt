package com.fiqih.restorantq.ui.viewholder

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.fiqih.restorantq.R
import com.fiqih.restorantq.R.string.kategori
import com.fiqih.restorantq.model.DetailKategori
import com.fiqih.restorantq.model.Kategori
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_detail_kategori.view.*

class DetailKategoriViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(
    R.layout.item_detail_kategori, parent, false)){

    private var ivResto = itemView.ivResto
    private var tvNamaresto: TextView? = null
    private var tvTempat: TextView? = null
    private var tvType: TextView? = null
    private var tvHarga: TextView? = null
    private var tvRate:TextView?=null

    init {
        tvNamaresto = itemView.findViewById(R.id.tvnamaresto)
        tvTempat = itemView.findViewById(R.id.tvAlamat)
        tvType = itemView.findViewById(R.id.tvType)
        tvHarga = itemView.findViewById(R.id.tvHarga)
        tvRate = itemView.findViewById(R.id.tvRate)
    }

    fun bind(detailKategori: DetailKategori, clickListener: (DetailKategori) -> Unit) {

        Log.i("errorgambar : ", detailKategori.img_resto)
        Picasso.get().load(detailKategori.img_resto)
            .placeholder(R.drawable.background_image_placeholder)
            .error(R.drawable.background_image_placeholder)
            .into(ivResto)
        tvNamaresto?.text = detailKategori.nama_resto
        tvTempat?.text = detailKategori.tempat
        tvType?.text = detailKategori.type
        tvHarga?.text = detailKategori.harga
        tvRate?.text = detailKategori.rate.toString()

        itemView.setOnClickListener { clickListener(detailKategori)}
    }
}