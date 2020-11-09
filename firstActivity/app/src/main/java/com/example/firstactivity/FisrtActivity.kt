package com.example.firstactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fist_layout.*

class FisrtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //调用setContentView()方法给当前activity加载一个布局(方法中传入布局文件的id)
        setContentView(R.layout.fist_layout)
        //订一弹出Toast的触发点

        //  gradle的这个插件id 'kotlin-android-extensions'，会根据布局文件中定义的空间id自动生成一个具有相同名称的变量
        button1.setOnClickListener{
            Toast.makeText(this,"你点击了button 1", Toast.LENGTH_LONG).show()
        }

        //一般来讲，正常的流程如下：
//        val button1: Button = findViewById(R.id.button1)//findViewById获得布局文件中定义的元素。返回一个继承自View的泛型对象
            //显示注册一个监听器，点击按钮就会触发监听器中的onClick方法
//        button1.setOnClickListener {
//            Toast.makeText(this,"你点击了button 1", Toast.LENGTH_LONG).show()
//        }

        button1.setOnClickListener { finish() }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this,"你触发了ADD菜单",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"你触发了REMOVE菜单",Toast.LENGTH_SHORT).show()
        }
        return true
    }
}