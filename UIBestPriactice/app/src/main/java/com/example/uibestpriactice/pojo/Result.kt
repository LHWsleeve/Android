package com.example.uibestpriactice.pojo


sealed class Result
class Success(val msg:String): Result()
class Failure(val error:Exception): Result()

fun getResultMsg(result: Result) = when(result){
    is Success -> result.msg
    is Failure -> result.error.message
}