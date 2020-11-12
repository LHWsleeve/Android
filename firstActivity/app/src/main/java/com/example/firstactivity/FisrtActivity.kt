package com.example.firstactivity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fist_layout.*

class FisrtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Log.d("FirstActivity",this.toString())
        //实验singleInstsnce
        Log.d("FirstActivity","Task id is $taskId")
        //调用setContentView()方法给当前activity加载一个布局(方法中传入布局文件的id)
        setContentView(R.layout.fist_layout)
        //订一弹出Toast的触发点

        //  gradle的这个插件id 'kotlin-android-extensions'，会根据布局文件中定义的空间id自动生成一个具有相同名称的变量

//        button1.setOnClickListener{
//            Toast.makeText(this,"你点击了button 1", Toast.LENGTH_LONG).show()
//        }

        //一般来讲，正常的流程如下：
//        val button1: Button = findViewById(R.id.button1)//findViewById获得布局文件中定义的元素。返回一个继承自View的泛型对象
            //显示注册一个监听器，点击按钮就会触发监听器中的onClick方法
//        button1.setOnClickListener {
//            Toast.makeText(this,"你点击了button 1", Toast.LENGTH_LONG).show()
//        }

        //退出当前页面
//        button1.setOnClickListener { finish() }

        //显示intent
        button1.setOnClickListener {
        Toast.makeText(this,"你点击了显示",Toast.LENGTH_LONG).show()
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        //隐式intent
//        button1.setOnClickListener {
//            Toast.makeText(this,"你点击了隐式",Toast.LENGTH_LONG).show()
//            val intent = Intent("com.example.firstactivity.ACTION_START")
//            intent.addCategory("com.example.firstactivity.MU_CATEGORY")
//            startActivity(intent)
//        }

    //intent调用系统网页
//       button1.setOnClickListener {
//           val intent = Intent(Intent.ACTION_VIEW)
//           intent.data = Uri.parse("https://www.baidu.com")
//           startActivity(intent)
//       }

        //调用系统拨号界面
//        button1.setOnClickListener {
//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:10086")
//            startActivity(intent)
//        }

        //intent 也可以传递数据
//        button1.setOnClickListener {
//            val data = "这是我传递的数据"
//            val intent = Intent(this,SecondActivity::class.java)
//            键值对的形式传输，前者是键，后者是传输的值
//            intent.putExtra("extra_data",data)
//            startActivity(intent)
//        }
        //返回数据给上一个activity
//        button1.setOnClickListener {
//            val intent = Intent(this,SecondActivity::class.java)
//            //第二个参数是请求码
//            startActivityForResult(intent,1)
//        }
//
        //测试standard启动模式（看起来像在first上启动first）--->验证standard模式是单纯的新建一个activity直接放到栈顶，不管当前栈顶是啥
//        button1.setOnClickListener {
//            val intent = Intent(this,FisrtActivity::class.java)
//            startActivity(intent)
//        }

    }

    /**
     * requestcode:启动时传入的请求码
     * result：返回数据时传入的处理结果
     * data：返回数据的intent
     * 由于每一个activity返回的数据都会回调到onAcitvityResult中，所以需要检查请求码，根据请求码，然后判断返回结果，最后处理数据
     */
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        when(requestCode){
//            1 -> if(resultCode == Activity.RESULT_OK){
//                 val returnedData = data?.getStringExtra("data_return")
//                Log.d("FirstActivity","返回的数据是 $returnedData")
//            }
//        }
//    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.add_item -> Toast.makeText(this,"你触发了ADD菜单",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"你触发了REMOVE菜单",Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onRestart() {

        super.onRestart()
        Log.d("FirstActivity","onRestart")
    }

}