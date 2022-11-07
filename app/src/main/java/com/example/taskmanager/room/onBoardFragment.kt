package com.example.taskmanager.room

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide.init
import com.example.taskmanager.R
import com.example.taskmanager.databinding.FragmentOnBoardBinding


class onBoardFragment : Fragment() {
    private lateinit var binding: FragmentOnBoardBinding
    lateinit var adapter: onBoardAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.skipped.setOnClickListener{
            findNavController().navigateUp()
        }
        binding.viewPager.adapter = adapter
        
        adapter = onBoardAdapter()
        binding.viewPager.setAdapter(adapter)
    }

}