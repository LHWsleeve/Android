package com.example.helloword

class Student(val sno:String,val grade:Int,name:String,age:Int)
    : Person(name ,age ),Study {

    constructor(name: String,age: Int) : this("次构造函数",80,name,age){

    }
    constructor() : this("次次构造函数",0)

    init {
        println("sno is "+sno)
        println("grade is "+grade)
    }

    override fun readBook() {
        println(name + "读书了")
    }

//    override fun doHomeWork()  {
//        println(name + "做作业")
//    }

}
fun main(){
    val student = Student("id=123",299,"jack",18)
    val dostudent = Student("jack",19)
    duStudy(dostudent)
}

fun duStudy(dostudent : Study) {
    dostudent.doHomeWork()
    dostudent.readBook()
}
