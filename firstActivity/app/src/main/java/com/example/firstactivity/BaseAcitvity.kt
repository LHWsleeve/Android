package com.example.firstactivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.third_layout.*

//不需要在Manifest中注册
open class BaseAcitvity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //打印当前类的实例的对象，相当于getclass(动态的)
        Log.d("BaseActivity",javaClass.simpleName)
        //将BaseActivity成为所有Act的父类（修改其他的Act全部继承于Base）

        //加入act容器中
        ActivityCollector.addAct(this)

    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeAct(this)
    }
}