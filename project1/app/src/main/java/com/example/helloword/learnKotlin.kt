package com.example.helloword

import kotlin.math.max

fun main(){
    val a=100
    val b=1000
//    println(largerNumber2(a,b))
//    checkNumber(a)
//    println(getScore2("abcfgfd"))
//    forMethod()
    val cellphone1 = Cellphone("xiaomi",1299.99)
    val cellphone2 = Cellphone("xiaomi",1299.99)
    println(cellphone1)
    println("cellphone1 equals cellphone2 = " + (cellphone1==cellphone2))
    Singleton.singletonTest()
    val list = listOf("Apple","Banna","Pears")
    for (fruit in list){
        println(fruit)
    }
    val Mlist = mutableListOf("234","2343","34r23",2)
    Mlist.add("2sf")
    for (i in Mlist){
        print(i)
        println(" " + i.javaClass)

    }
    val listNumber = listOf("s232","fefe","e4rt43f","h34r23")
    val maxLength = listNumber.maxBy { it.length }
    println("max length ： "+ maxLength)

    val lamda = {case :String -> case.toUpperCase()}
    val upCase = listNumber.filter { it.length>4 }.map { it.toUpperCase() }
    for (case in upCase){
        println(case)
    }

}
fun forMethod(){
    for (i in 0 until 10 step 2){
        print(i)
    }
    println("====")
    for (i in 10 downTo 1){
        print(i)
    }
}
fun largerNumber(num1:Int,num2:Int) = max(num1,num2)
fun largerNumber2(num1: Int,num2: Int)= if(num1>num2) num1 else num2
fun getScore(name:String) = when (name){
    "tom" ->100
    "bob" ->23
    "sds" ->70
    else -> 0
}
fun getScore2(name:String) = when{
    name.startsWith("abc") ->"86"
    name == "tom" ->"77"
    else -> 0
}

fun checkNumber(num1: Number) = when(num1){
    is Int -> println("number is int")
    is Double -> println("是double")
    is Float -> println("是float")
    else -> println("不是数字")
}

