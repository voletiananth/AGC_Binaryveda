package com.voleti.binaryveda.helper

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.voleti.binaryveda.ArtGalleryFragment

class ViewPagerAdapter(manager: FragmentManager,lifecycle: Lifecycle) : FragmentStateAdapter(manager,lifecycle) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return  ArtGalleryFragment()
    }
}