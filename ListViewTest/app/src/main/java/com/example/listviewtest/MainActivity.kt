package com.example.listviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    private val data = listOf("苹果","香蕉34t43","sdfsd香蕉","香蕉df","fdsgsd香蕉","香dfdfd","fdgfdgb","3如","花生","句子"
//            ,"fdsgsd香蕉","香dfdfd","fdgfdgb","3如","花生","句子","fdsgsd香蕉","香dfdfd","fdgfdgb","3如","花生","句子")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
////        集合无法直接传递给ListView，需要节主适配器来完成。Android中已经有很多适配器的实现类，直接通过泛型来指定要适配的数据类型
//        //simple_list_item_1这是一个Android内置的布局文件
//        var adapter= ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
//        //调用set方法，将构建好的适配器对象传递进去。ListView和数据之间的关联建立完成
//        listView.adapter=adapter
//    }
    private val fruitList = ArrayList<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits()//初始化水果数据
        var adapter = FruitAdapter(this, R.layout.fruit_item, fruitList)
        //传入apapter是一样的，主要是自定义了一个adapter用来接受泛型数据，同样，布局也要自定义。
        // 不能再像之前那样直接在xml中写一个ListView控键，儿是组合键
        listView.adapter=adapter

    }

    private fun initFruits() {
        repeat(2){
            fruitList.add(Fruit("Apple", R.drawable.apple_pic))
            fruitList.add(Fruit("Banana", R.drawable.banana_pic))
            fruitList.add(Fruit("Orange", R.drawable.orange_pic))
            fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
            fruitList.add(Fruit("Pear", R.drawable.pear_pic))
            fruitList.add(Fruit("Grape", R.drawable.grape_pic))
            fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
            fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
            fruitList.add(Fruit("Cherry", R.drawable.cherry_pic))
            fruitList.add(Fruit("Mango", R.drawable.mango_pic))
        }
    }

}