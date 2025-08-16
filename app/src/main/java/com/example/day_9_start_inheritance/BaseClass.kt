package com.example.day_9_start_inheritance


// open keyword is for accessing the class form other file
// :. now i was access the base class in secondary.kt
//open class BaseClass {
//    //    This open also work is like that we will override it in secondary class
//   open fun role(){
//        println("Heello I'am a Head of a BaseClass ")
//    }
//
//    fun main(){
//        println("how the base value for ")
//    }
//}

//==================================================================================================================

//In this we use files - 1] BaseClass.kt, 2] Secondary.kt, 3]Teretery 4] main file day9.kt
open class BaseClass {
    open fun role(){
        println("Heello I'am a Head of a BaseClass ")
    }
}