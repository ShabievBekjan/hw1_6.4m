package com.example.taskmanager.ui.task

import android.R.attr.data
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example.taskmanager.data.Task
import com.example.taskmanager.databinding.FragmentTaskBinding
import com.example.taskmanager.room.App
import com.example.taskmanager.ui.home.HomeFragment


class TaskFragment : Fragment() {

    private lateinit var binding: FragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnAdd.setOnClickListener {
            val title = binding.etTitle.text.toString()
            val description = binding.etDesc.text.toString()
            val task = Task(
                title = title,
                desc = description
            )
            if (title.isEmpty() || description.isEmpty()) {
                Toast.makeText(requireContext(), "error", Toast.LENGTH_SHORT).show()
            } else {
                App.dataBase.dao().insert(task)


                setFragmentResult(
                    HomeFragment.TASK, bundleOf("key_task" to task)
                )
                findNavController().navigateUp()
            }
        }
    }
}