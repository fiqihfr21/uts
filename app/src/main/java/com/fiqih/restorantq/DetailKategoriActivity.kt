package com.fiqih.restorantq

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.fiqih.restorantq.model.DetailKategori
import com.fiqih.restorantq.ui.adapter.DetailKategoriAdapter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_kategori.*
import kotlinx.android.synthetic.main.item_detail_kategori.*

class DetailKategoriActivity : AppCompatActivity() {

    private val detailKategori = listOf(
        DetailKategori(
            1,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Sushi Tomi",
            "Mountain View",
            "Sushi",
            "$30 untuk dua",
            3.5
        ),
        DetailKategori(
            2,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Specialty",
            "Mountain View",
            "Kafe, Kue, Roti",
            "$25 untuk dua",
            4.5
        ),
        DetailKategori(
            3,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Amici's East Coast",
            "Mountain View",
            "Pizza, Italy",
            "$45 untuk dua",
            3.0
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            3.5
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            3.7
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            4.0
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            3.5
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            4.5
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            3.5
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            3.5
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            3.5
        ),
        DetailKategori(
            4,
            "https://www.masakapahariini.com/wp-content/uploads/2019/02/nasi-padang-1024x768.jpg",
            "Shana Thai",
            "Mountain View",
            "Thai",
            "$50 untuk dua",
            4.0
        )
    )

    var adapter: DetailKategoriAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kategori)

        val bundle:Bundle? = intent.extras
        val image = bundle!!.getString("image")
        val kategori = bundle!!.getString("kategori")
        val jml_outlet = bundle!!.getString("jml_outlet")
        val jml_disimpan = bundle!!.getString("jml_disimpan")
        val deskripsi = bundle!!.getString("deskripsi")

        Picasso.get().load(image)
            .placeholder(R.drawable.background_image_placeholder)
            .error(R.drawable.background_image_placeholder)
            .into(ivdetailkategori)

        tvkategori.text = kategori
        tvjumlahoutlet.text = jml_outlet.toString()+" Outlet, Disimpan"+jml_disimpan.toString()+" Kali"
        tvdeskripsi.text = deskripsi

        recycler_view_gv_kategori.apply {
            layoutManager = GridLayoutManager(this@DetailKategoriActivity,2)
            adapter = DetailKategoriAdapter(detailKategori, { partItem: DetailKategori -> partItemClicked(partItem) })
        }

    }

    private fun partItemClicked(partItem: DetailKategori) {
        val img_resto: String = partItem.img_resto
        val nama_resto: String = partItem.nama_resto
        val tempat: String = partItem.tempat
        val type: String = partItem.type
        val harga : String = partItem.harga
        val rate : Double = partItem.rate
        val intent = Intent(this, DetailMenuActivity::class.java)

        intent.putExtra("img_resto", img_resto)
        intent.putExtra("nama_resto", nama_resto)
        intent.putExtra("tempat", tempat)
        intent.putExtra("type", type)
        intent.putExtra("harga", harga)
        intent.putExtra("rate", rate)
        startActivity(intent)
    }
}
