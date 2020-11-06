package com.example.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FisrtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //调用setContentView()方法给当前activity加载一个布局(方法中传入布局文件的id)
        setContentView(R.layout.fist_layout)
    }
}