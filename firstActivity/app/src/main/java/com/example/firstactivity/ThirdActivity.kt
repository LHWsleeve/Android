package com.example.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.third_layout.*

class ThirdActivity : BaseAcitvity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //singleInstance
        Log.d("ThirdActivity","Task id is $taskId")
        setContentView(R.layout.third_layout)

        //点击退出全部Activities
        button3.setOnClickListener {
            ActivityCollector.finishAll()
        }
    }
}