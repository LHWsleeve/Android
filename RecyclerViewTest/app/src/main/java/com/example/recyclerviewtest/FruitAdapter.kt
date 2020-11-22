package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(val fruitList:List<Fruit>) :RecyclerView.Adapter<FruitAdapter.ViewHolder>(){

//    继承自RecyclerView.ViewHolder的一个内部类，传入一个view(最外层布局)
    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val fruitImage:ImageView = view.findViewById(R.id.friutImage)
        val fruitName:TextView = view.findViewById(R.id.friutName)
    }

    //加载fruit_item，返回ViewHolder实例
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item,parent,false)
        //一开始我直接按照书上将监听器注册在这里，但是adapterPosition函数一直返回-1，解决方法在onBindViewHolder
        return ViewHolder(view)
    }

    /**
     * 对子项赋值，每个子项被滚动到屏幕内的时候执行
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImage.setImageResource(fruit.imageId)
        holder.fruitName.text=fruit.name

        /**
         * 通过View添加点击事件,并且和ListView不同(只能点击整个子项)，这种方式可以点击子项中任意模块
         * 注意：
         * -1是因为layout布局没有完成导致的..
         * 解决方法:onBindViewHolder...并且建议所有onClickListener的代码都放在这里...
         */
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context,"你点击了view ${fruit.name}",Toast.LENGTH_SHORT).show()
        }

        holder.fruitImage.setOnClickListener {
            Toast.makeText(holder.itemView.context,"你点击了view ${fruit.imageId}",Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount()= fruitList.size
}