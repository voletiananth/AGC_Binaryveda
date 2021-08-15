package com.voleti.binaryveda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.voleti.binaryveda.databinding.ArtGalleryListBinding
import com.voleti.binaryveda.helper.RecyclerViewAdapter


class ArtGalleryFragment: Fragment() {
    private lateinit var binding : ArtGalleryListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ArtGalleryListBinding.inflate(layoutInflater)
        initialize()
        return binding.root
    }
    private fun initialize(){
        val imagesIds = arrayOf(R.drawable.image_one,R.drawable.image_two,R.drawable.image_three,R.drawable.image_four,R.drawable.image_five,R.drawable.image_six)
        binding.recycleView.apply {
            layoutManager = GridLayoutManager(context,2)
            adapter = RecyclerViewAdapter(imagesIds)
        }

    }



}