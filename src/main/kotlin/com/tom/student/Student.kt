package com.tom.student

import java.util.*

fun main(args: Array<String> ) {
    val scanner = Scanner(System.`in`)
    println("請輸入學生姓名、英文成績、數學成績：")
    print("請輸入學生姓名：")
    var name = scanner.next()
    print("請輸入學生數學成績：")
    var math = scanner.nextInt()
    print("請輸入學生英文成績：")
    var english = scanner.nextInt()
    val stu = Student(name,math,english)
    stu.print()

}

class Student(var name:String,var english: Int,var math: Int){
    fun print(){
        println(name + "\t" + english + "\t" + math + "\t" +
                (english + math)/2)
    }
}
