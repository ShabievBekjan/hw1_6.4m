package com.example.taskmanager.room

import android.app.Application
import androidx.room.Room

class App:Application() {


    companion object {
        private lateinit var instace:App
        lateinit var dataBase:RoomDataBase


        fun getInstance(): App{
            return instace
        }
    }

    override fun onCreate() {
        super.onCreate()
        instace = this
        dataBase = Room.databaseBuilder(this,RoomDataBase::class.java,"dataBase").allowMainThreadQueries().build()
    }
    fun getDatabase():RoomDataBase {
        return dataBase
    }
}