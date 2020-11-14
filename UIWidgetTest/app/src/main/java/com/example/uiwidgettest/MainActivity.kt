package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * View.OnClickListener:使用接口来注册一个监听器
 */
class MainActivity : AppCompatActivity() ,View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Java函数式API方式编写监听器
//        button.setOnClickListener {
//            var toString = editText.text.toString()
//            Toast.makeText(this,toString,Toast.LENGTH_SHORT).show()
//        }
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.button -> {
//                点击button获得edittext中的文字
                val inputText = editText.text.toString()
                Toast.makeText(this,inputText,Toast.LENGTH_SHORT).show()
            }
        }
    }


}