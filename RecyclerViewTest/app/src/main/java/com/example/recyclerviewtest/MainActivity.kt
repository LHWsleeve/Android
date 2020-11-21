package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fruitList = ArrayList<Fruit>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFruits2()//初始化水果数据
        //创建layoutManager实例，并且放到RecyclerView中，指定线性布局方式
//        val layoutManager = LinearLayoutManager(this)
//        加入一行代码设置布局排列方向，默认是纵向的，改成横向
//        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        //瀑布流布局的layout
        var layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        recyclerView.adapter = adapter
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
//瀑布流布局
    private fun initFruits2() {
        repeat(2){
            fruitList.add(Fruit(getRandomLenghString("Apple"),R.drawable.apple_pic))
            fruitList.add(Fruit(getRandomLenghString("Banana"), R.drawable.banana_pic))
            fruitList.add(Fruit(getRandomLenghString("Orange"), R.drawable.orange_pic))
            fruitList.add(Fruit(getRandomLenghString("Watermelon"), R.drawable.watermelon_pic))
            fruitList.add(Fruit(getRandomLenghString("Pear"), R.drawable.pear_pic))
            fruitList.add(Fruit(getRandomLenghString("Grape"), R.drawable.grape_pic))
            fruitList.add(Fruit(getRandomLenghString("Pineapple"), R.drawable.pineapple_pic))
            fruitList.add(Fruit(getRandomLenghString("Strawberry"), R.drawable.strawberry_pic))
            fruitList.add(Fruit(getRandomLenghString("Cherry"), R.drawable.cherry_pic))
            fruitList.add(Fruit(getRandomLenghString("Mango"), R.drawable.mango_pic))
        }
    }

    private fun getRandomLenghString(s: String): String {
        val n = (1..20).random()
        val builder = StringBuffer()
        repeat(n){
            builder.append(s)
        }
        return builder.toString()
    }

}