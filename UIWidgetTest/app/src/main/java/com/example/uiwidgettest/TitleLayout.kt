package com.example.uiwidgettest

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.title.view.*

/**
 * title.xml针对TitleLayout.kt的布局(已经编辑好代码的自定义控键)
 * 然后再main布局中直接引入即可
 * 这样只要我们引入一个titleLayout布局的时候，返回和编辑按钮就已经搞定了
 */
class TitleLayout(context: Context,attrs:AttributeSet): LinearLayout(context, attrs){
    init {
        LayoutInflater.from(context).inflate(R.layout.title,this)
        //    给标题栏中的按钮增加注册点击事件
        titleBack.setOnClickListener {
//            TitleLayout中接受的context参数实际上是一个Activity的实例，
//            在返回按钮的点击事件里，我们要先将它转换成Activity类型，然后在调用finish()销毁
            val activity = context as Activity
            activity.finish()
        }
        titleEdit.setOnClickListener {
            Toast.makeText(context, "You clicked Edit button", Toast.LENGTH_SHORT).show()
        }
    }


}