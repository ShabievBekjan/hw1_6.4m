package com.example.taskmanager.ui.task

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.taskmanager.data.Task
import com.example.taskmanager.databinding.ItemTaskBinding

class TaskAdapter:RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

private val tasks = arrayListOf<Task>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
return TaskViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
fun addTask(task: Task){
    tasks.add(0,task)
     notifyItemChanged(0)
}
    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind()
        if (position % 2 == 0){
            holder.itemView.setBackgroundColor(Color.GRAY)

            }else{
                holder.itemView.setBackgroundColor(Color.WHITE)
        }

    }

    override fun getItemCount(): Int = tasks.size

    inner class TaskViewHolder (private val binding : ItemTaskBinding) :RecyclerView.ViewHolder(binding.root){
fun bind(){
    var item = tasks[adapterPosition]
    binding.tvTitle.text = item.title
    binding.tvDescription.text = item.desc
}
    }
}