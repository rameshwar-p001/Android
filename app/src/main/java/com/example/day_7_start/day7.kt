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
//fun main(){
//    val mo=listOf(1,2,3)
//    val mo1=mo.map { it*2 }
//    println(mo1)
//}

//copy method

//fun main() {
//    // Vase objects ka list
//    val vaseList = listOf(
//        Vase(10, 5, 3)
//    )
//    // map method se har vase ka volume nikalna
//    val volumes = vaseList.map { vase ->
//        vase.height * vase.length * vase.breadth
//    }
//    println("Volumes: $volumes")
//}
//
//data class Vase(val height: Int, val length: Int, val breadth: Int)


//let and nulable
//1) Nulable
//fun main() {
//    var name: String? = "Rameshwar"  // Nullable String
//    name = null // allowed
//
//    var city: String = "Pune" // Non-nullable String
//    // city = null  // ❌ Error: null assign nahi kar sakte
//}

//2)Let

fun main() {
    var name: String? = "Rameshwar"

    name?.let {
        println("Name length is ${it.length}")
    }
}

