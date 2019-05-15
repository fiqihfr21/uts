package com.fiqih.restorantq.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.fiqih.restorantq.ui.fragment.FragmentDisimpan
import com.fiqih.restorantq.ui.fragment.FragmentKoleksiTerpilih
import com.fiqih.restorantq.ui.fragment.FragmentMilikSaya


class KategoriTabAdapter(fm : FragmentManager): FragmentPagerAdapter(fm){
    private val pages = listOf(
        FragmentKoleksiTerpilih(),
        FragmentDisimpan(),
        FragmentMilikSaya()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Koleksi Terpilih"
            1 -> "Disimpan"
            else -> "Milik Saya"
        }
    }

}