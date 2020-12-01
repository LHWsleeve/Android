package com.example.uibestpriactice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uibestpriactice.pojo.Msg
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    private val msgList =ArrayList<Msg>()
    private lateinit var adapter:MsgAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMsg()
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        if (!::adapter.isInitialized) {
            adapter = MsgAdapter(msgList)
        }
        recyclerView.adapter = adapter
        send.setOnClickListener {
//            this
            val content = inputText.text.toString()
            if (content.isNotEmpty()) {
                val msg = Msg(content, Msg.TYPE_SENT)
                msgList.add(msg)
                adapter.notifyItemInserted(msgList.size - 1)//当有新消息刷新view种的显示
//                adapter.notifyDataSetChanged()
                recyclerView.scrollToPosition(msgList.size-1)//将View定位到最后一行
                //这里定位存在问题，每次刷新了全部页面，导致看不见前面的信息
                inputText.setText("")//清空输入框
            }
        }
    }

//    override fun onClick(v: View?) {
//        when (v) {
//            send -> {
//                val content = inputText.text.toString()
//                if (content.isNotEmpty()) {
//                    val msg = Msg(content, Msg.TYPE_SENT)
//                    msgList.add(msg)
//                    adapter.notifyItemInserted(msgList.size - 1) // 当有新消息时，刷新RecyclerView中的显示
//                    recyclerView.scrollToPosition(msgList.size - 1)  // 将RecyclerView定位到最后一行
//                    inputText.setText("") // 清空输入框中的内容
//                }
//            }
//        }
//    }

            private fun initMsg() {
                val msg1 = Msg("Hello guy.", Msg.TYPE_RECEVIED)
                msgList.add(msg1)
                val msg2 = Msg("Hello. Who is that?", Msg.TYPE_SENT)
                msgList.add(msg2)
                val msg3 = Msg("This is Tom. Nice talking to you. ", Msg.TYPE_RECEVIED)
                msgList.add(msg3)

            }
        }

