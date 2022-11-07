package com.example.taskmanager.room

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.taskmanager.R
import com.example.taskmanager.databinding.ItemBoardBinding

class onBoardAdapter: RecyclerView.Adapter<onBoardAdapter.onBoardViewHolder>() {
    val lotti = arrayListOf(R.raw.lotti1,R.raw.lotti2,R.raw.lotti2)
    var title = arrayListOf("hello,privet,salam")
    var description = arrayListOf("hello,privet,salam")

    inner class onBoardViewHolder(private val binding: ItemBoardBinding):
            RecyclerView.ViewHolder(binding.root){
                fun bind(position: Int){
                    binding.title.text  =title[position]
                    binding.description.text  =description[position]
                    binding.lotti.setAnimation(lotti[position])
                }

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): onBoardViewHolder {
        return onBoardViewHolder(ItemBoardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: onBoardViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = 3

    }
