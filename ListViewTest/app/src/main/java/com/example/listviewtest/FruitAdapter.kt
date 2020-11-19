package com.example.listviewtest

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(activity: Activity,val resourceId: Int,data:List<Fruit>)
    :ArrayAdapter<Fruit>(activity,resourceId,data){
    //使用ViewHolder优化每次都需要View.findViewById函数
    //ViewHolder内部类，对imagr和text控件实例缓存，当convertview是null时候，创建一个ViewHolder对象
    //存储在view中，并将控键实例存放在ViewHolder里面，然后调用View的setTag()方法，讲ViewHolder对象存在view中。
    //当convertView不为null的时候调用getTag()方法去除内容
    inner class ViewHolder(val fruitImage:ImageView, val fruitName:TextView)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        //使用convertView性能优化，将之前加载好的布局缓存，以便重用
        val view:View
        val viewHolder:ViewHolder
        if(convertView==null){
            view = LayoutInflater.from(context).inflate(resourceId,parent,false)
            val fruitImage:ImageView = view.findViewById(R.id.friutImage)
            val fruitName:TextView = view.findViewById(R.id.friutName)
            viewHolder = ViewHolder(fruitImage, fruitName)
            view.tag=viewHolder
        }else{
            view=convertView
            viewHolder = view.tag as ViewHolder
        }
        var fruit = getItem(position)
        if (fruit!=null){
            viewHolder.fruitImage.setImageResource((fruit.imageId))
            viewHolder.fruitName.text=fruit.name
        }
        return view

    }
}