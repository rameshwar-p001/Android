package com.example.day_9_start_try_catch_final

import android.R


////Simple code for input and output  but when we input any alphabet then it get error
//fun main() {
//    println("Enter Number.....")
//    val no = readln().toInt()
//    println("Enter Number is $no")
//}

////Thats why we use try and catch

fun main() {
    println("Entar a number")
    try {
        val no = readln().toInt()
        println("Enter number is $no")
    } catch (e: Exception) {
        println(e.message)
        println("Enter a valid number not an alphabet")
    } finally {
        println("it was execueted any time ")
    }
}


