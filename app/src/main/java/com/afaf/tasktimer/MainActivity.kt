package com.afaf.tasktimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    // Abdullah Comment

    lateinit var Task: ArrayList<String>
    lateinit var adapter : RecyclerViewTask
    lateinit var rvTask : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Task = ArrayList()
        rvTask = findViewById(R.id.rvMain)
        adapter = RecyclerViewTask(Task)
        rvTask.adapter = adapter
        rvTask.layoutManager


        //hi from wasan
    }
}