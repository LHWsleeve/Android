package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.Fruit

class FruitAdapter(val fruitList:List<Fruit>) :RecyclerView.Adapter<FruitAdapter.ViewHolder>(){

//    继承自RecyclerView.ViewHolder的一个内部类，传入一个view(最外层布局)
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val fruitImage:ImageView = view.findViewById(R.id.friutImage)
        val fruitName:TextView = view.findViewById(R.id.friutName)
    }

    //加载fruit_item，返回ViewHolder实例
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item,parent,false)
        return ViewHolder(view)
    }

    /**
     * 对子项赋值，每个子项被滚动到屏幕内的时候执行
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text=fruit.name

    }

    override fun getItemCount()= fruitList.size
}