package com.example.firstactivity

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.fist_layout.*
import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : BaseAcitvity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Log.d("SecondActivity",this.toString())
        //实验singleInstance
        Log.d("SecondActivity","Task id is $taskId")
        setContentView(R.layout.second_layout)
//        button2.setOnClickListener {
//            var intent = Intent(this, FisrtActivity::class.java)
//            startActivity(intent)
//        }

//        button2.setOnClickListener {
//            var intent = Intent(this, ThirdActivity::class.java)
//            startActivity(intent)
//        }

        //获取intent传递过来的值
//        val extraData = intent.getStringExtra("extra_data")
//        Log.d("SecondActivity","extra data is $extraData")

        //返回值
//        button2.setOnClickListener {
//            空的intent，他不指定任何东西，仅仅用来传递数据
//            val intent = Intent()
//            intent.putExtra("data_return","这是我要返回的值")
//            setResult(Activity.RESULT_OK,intent)
//            finish()
//        }

        //这样可以调用act1中通过actionStart传递过来的参数
        var stringExtra = intent.getStringExtra("param1")
        println(stringExtra)
    }

    //有可能存在的问题：启动act2必须要传递部分参数，但是act2不是我开发的，那么如何知道要act1传递什么数据？
    //一个新的数据结构 companion object:这个结构中的方法类似于java中的静态方法
    companion object {
        /**
         * 这个方法中完成了inent构建，sec中需要的数据都通过actionstart的参数传递，存储到inent中，讲context作为上下文，然后显示调用sec
         * 这样act1可以直接调用actionStart(类似静态方法)函数并且传入所需要的参数
         */
        fun actionStart(context: Context, data1:String,data2:String){
            var intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("param1",data1)
            intent.putExtra("param2",data2)
            context.startActivity(intent)
        }
    }

    //重写 onBackPressed方法， 点击back携带数据返回
    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return","这是我要返回的值")
        setResult(Activity.RESULT_OK,intent)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondAct","onDestory")
    }
}