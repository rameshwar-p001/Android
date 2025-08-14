package com.example.day_7_start

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


//Lamda expression
//@Composable
//fun main(){
//val doubbleNumber:(Int)->Int={it*2}          //"(Int)->Int={it*2}"  is called lamda
//Text(text = doubbleNumber(5).toString())
//}


//Map keyword
fun main(){
    val mo=listOf(1,2,3)
    val mo1=mo.map { it*2 }
    println(mo1)
}