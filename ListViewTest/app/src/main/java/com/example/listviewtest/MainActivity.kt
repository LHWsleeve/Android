package com.example.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val data = listOf("苹果","香蕉34t43","sdfsd香蕉","香蕉df","fdsgsd香蕉","香dfdfd","fdgfdgb","3如","花生","句子"
            ,"fdsgsd香蕉","香dfdfd","fdgfdgb","3如","花生","句子","fdsgsd香蕉","香dfdfd","fdgfdgb","3如","花生","句子")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        集合无法直接传递给ListView，需要节主适配器来完成。Android中已经有很多适配器的实现类，直接通过泛型来指定要适配的数据类型
        //simple_list_item_1这是一个Android内置的布局文件
        var adapter= ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
        //调用set方法，将构建好的适配器对象传递进去。ListView和数据之间的关联建立完成
        listView.adapter=adapter
    }
}