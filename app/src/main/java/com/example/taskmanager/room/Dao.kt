package com.example.taskmanager.room

import androidx.room.*
import androidx.room.Dao
import com.example.taskmanager.data.Task

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(task:Task)

    @Delete
    fun delete(task:Task)

    @Query("SELECT * FROM taskModel")
        fun getAllNotes():List<Task>
}