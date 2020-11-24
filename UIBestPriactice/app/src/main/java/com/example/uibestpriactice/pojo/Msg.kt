package com.example.uibestpriactice.pojo

/**
 * content:消息内容
 * type:消息类型
 */
class Msg(val content:String,val type:Int) {
    companion object{
        const val TYPE_RECEVIED=0
        const val TYPE_SENT=1
    }

}