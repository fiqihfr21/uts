package com.fiqih.restorantq

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fiqih.restorantq.ui.adapter.KategoriTabAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.adapter = KategoriTabAdapter(supportFragmentManager)
        tabs.setupWithViewPager(viewpager)
    }
}
