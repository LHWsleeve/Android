package com.example.firstactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.fist_layout.*
import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : AppCompatActivity() {
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

        button2.setOnClickListener {
            var intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

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