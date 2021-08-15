package com.voleti.binaryveda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.voleti.binaryveda.databinding.ActivityProfieBinding
import com.voleti.binaryveda.helper.ViewPagerAdapter

class ProfileActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityProfieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager.adapter = viewPageAdapter()
        bindTabs()

    }

    private fun bindTabs(){
        val tabIcons = arrayOf(R.drawable.ic_upload,R.drawable.ic_exhibitions,R.drawable.ic_revenue)
        val tabNames = arrayOf(R.string.uploads,R.string.exhibitions,R.string.revenue)
        TabLayoutMediator(binding.tabLyt,binding.viewPager){ tab,position ->
            tab.setIcon(tabIcons[position])
            tab.setText(tabNames[position])

        }.attach()
    }

    private  fun viewPageAdapter():ViewPagerAdapter{
        return ViewPagerAdapter(supportFragmentManager,lifecycle)
    }

}