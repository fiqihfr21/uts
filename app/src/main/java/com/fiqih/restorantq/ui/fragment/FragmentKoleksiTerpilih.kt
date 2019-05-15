package com.fiqih.restorantq.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fiqih.restorantq.DetailKategoriActivity
import com.fiqih.restorantq.R
import com.fiqih.restorantq.model.Kategori
import com.fiqih.restorantq.ui.adapter.KoleksiAdapter
import kotlinx.android.synthetic.main.fragment_koleksi_terpilih.*


class FragmentKoleksiTerpilih: Fragment(){

    private val kategori = listOf(
        Kategori(
            1,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Terpopuler Minggu Ini",
            8,
            15118,
            "Restoran terpopuler di kotamu minggu ini"
        ),
        Kategori(
            2,
            "https://www.saribundo.biz/wp-content/uploads/2016/12/Inilah-Rahasia-Membuat-Masakan-Padang-Agar-Terasa-Lezat.jpg",
            "Sarapan Pagi",
            6,
            15118,
            "Restoran terpopuler di kotamu minggu ini"
        ),
        Kategori(
            3,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Jajanan Malam",
            8,
            5909,
            "Restoran terpopuler di kotamu minggu ini"
        ),
        Kategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Kopi Terbaik",
            9,
            1029,
            "Restoran terpopuler di kotamu minggu ini"
        ),
        Kategori(
            5,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Untuk Si Pecinta Manis",
            5,
            2990,
            "Restoran terpopuler di kotamu minggu ini"
        )
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater!!.inflate(R.layout.fragment_koleksi_terpilih, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view!!, savedInstanceState)

        recycler_view_koleksi.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = KoleksiAdapter(kategori, { partItem: Kategori -> partItemClicked(partItem) })
        }

    }

    private fun partItemClicked(partItem: Kategori) {
        val image: String = partItem.img_kategori
        val kategori: String = partItem.kategori
        val jml_outlet: String = partItem.jml_outlet.toString()
        val jml_disimpan: String = partItem.jml_disimpan.toString()
        val deskripsi:String = partItem.deskripsi
        val intent = Intent(context, DetailKategoriActivity::class.java)

        intent.putExtra("image", image)
        intent.putExtra("kategori", kategori)
        intent.putExtra("jml_outlet", jml_outlet)
        intent.putExtra("jml_disimpan", jml_disimpan)
        intent.putExtra("deskripsi", deskripsi)
        context!!.startActivity(intent)
    }
}