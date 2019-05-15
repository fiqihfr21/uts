package com.fiqih.restorantq

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_menu.*

class DetailMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)

        val bundle:Bundle? = intent.extras
        val img_resto = bundle!!.getString("img_resto")
        val nama_resto = bundle!!.getString("nama_resto")
        val tempat = bundle!!.getString("tempat")
        val type = bundle!!.getString("type")
        val rate = bundle!!.getDouble("rate")

        Picasso.get().load(img_resto)
            .placeholder(R.drawable.background_image_placeholder)
            .error(R.drawable.background_image_placeholder)
            .into(ivResto)

        tvnamaresto.text = nama_resto
        tvAlamat.text = tempat
        tvType.text = type
        tvRate.text = rate.toString()

    }


}
