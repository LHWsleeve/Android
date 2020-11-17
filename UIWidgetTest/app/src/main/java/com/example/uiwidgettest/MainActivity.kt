package com.example.uiwidgettest

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.*
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * View.OnClickListener:使用接口来注册一个监听器
 */
class MainActivity : AppCompatActivity() , OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Java函数式API方式编写监听器
//        button.setOnClickListener {
//            var toString = editText.text.toString()
//            Toast.makeText(this,toString,Toast.LENGTH_SHORT).show()
//        }
        //点击按钮切换图片
//        button.setOnClickListener {
//            imageView.setImageResource(R.drawable.img_1)
//        }
        //点击按钮改变进度条状态
//        button.setOnClickListener {
//            if (progressBar.visibility== VISIBLE){
//                progressBar.visibility= GONE
//            }else{
//                progressBar.visibility= VISIBLE
//            }
//        }

        //点击按钮进度条+10
//        button.setOnClickListener {
//            progressBar.progress+=10
//        }

        //AlterDialog：当前界面弹出一个对话框，指定在所有界面元素之上
        //屏蔽其他控件，用来警示作用
//        button.setOnClickListener {
//            //构建对话框
//            AlertDialog.Builder(this).apply {
//                setTitle("重要信息")
//                setCancelable(false)
//                setPositiveButton("OK"){dialog, which ->  }
//                setNegativeButton("Cancel"){dialog, which ->  }
//                show()
//            }
//        }
    }

    override fun onClick(v: View?) {
//        Log.d("onclick","我执行类")
//        when (v?.id){
//            R.id.button -> {
//                点击button获得edittext中的文字
//                val inputText = editText.text.toString()
//                Toast.makeText(this,inputText,Toast.LENGTH_SHORT).show()
//            }
//        }
    }


}


