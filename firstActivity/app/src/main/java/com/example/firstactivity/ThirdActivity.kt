package com.example.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //singleInstance
        Log.d("ThirdActivity","Task id is $taskId")
        setContentView(R.layout.third_layout)
    }
}