package com.example.taskmanager.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
@Entity(tableName = "taskModel")
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id :Int = 0,
    var title:String? = null,
    var desc:String? = null,
    var time:Long? = null,
): Serializable
