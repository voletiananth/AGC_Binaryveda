package com.voleti.binaryveda.helper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.voleti.binaryveda.databinding.ArtGalleryItemBinding

class RecyclerViewAdapter(private val data: Array<Int>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(binding: ArtGalleryItemBinding):RecyclerView.ViewHolder(binding.root){
      val binding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ArtGalleryItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.binding.image.setImageResource(data[position])
    }

    override fun getItemCount(): Int = data.size
}
