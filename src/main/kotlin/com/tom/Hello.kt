package com.tom

fun main(args: Array<String>) {
//    println("Hello World!")
//  Human().hello()
    val h = Human(weight = 66.5f,height=1.7f)
    println(h.bmi())
    val score = 88
    println(score > 60)
    val c:Char = 'A'
    println(c.toInt() > 60)
    /*h.hello()
    var age : Int = 25;
    age = age.plus(1)
    val weight = 65.5
    val enroll : Boolean = true
    println(age)*/
}

class Human(var name:String ="" ,var weight:Float,var height:Float) {
    init {
        println("test$weight")
    }
//    constructor(name:String,weight:Float,height:Float):this(weight,height)

    fun bmi():Float{
        val bmi = weight/(height*height)
        return bmi
    }

    fun hello(){
        println("Hello Kotlin")
    }

}