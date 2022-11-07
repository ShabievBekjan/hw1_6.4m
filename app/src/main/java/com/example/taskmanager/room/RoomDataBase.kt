package com.example.taskmanager.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.taskmanager.data.Task

@Database(entities = [Task::class] , version = 1)
abstract class RoomDataBase:RoomDatabase() {
    abstract fun dao():Dao
}