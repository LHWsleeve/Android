package com.example.helloword

open class Person(val name:String,val age:Int) {
    fun eat(){
        println(name+" is eating. He is "+age+" years old.")
    }
}
fun main(){
    val p = Person("afa",14)
    p.eat()
}