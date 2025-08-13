package com.example.day_2_start

//day 2 25

//fun main(){
//    println("Hello world")
//}


//day 2 26

//fun main(){
//    var a=100
//    println(a)
//    a=120
//    println(a)
////    val is work like a consatant
//    val b=399
////    b=244
//    print(b)
//}

//day 2 27
//fun main(){
//    var a : Long = 100   //you can give directly integer type for not found error
//    println(a)
//    a=12000000000000         //when we directly give big no without change main var it will show error
//    println(a)
//
//}

//day 2 28
//fun main(){
//    var pi =3.14
//    println(pi)
//
//    var pi1=3.1443134134213424f
//    println(pi1)
//}


//Day 2 30
//fun main(){
//
//val myTrue: Boolean = true
//val myFalse: Boolean = false
//val boolNull: Boolean? = null
//
//println(myTrue || myFalse)
//println(myTrue && myFalse)
//println(!myTrue)
//println(boolNull)
//
//}

////Day 2 31
//fun main(){
//    val aChar: Char = 'a'
//
//    println(aChar)
//    println('\n') // Prints an extra newline character
//    println('\u00AE')
//}

////Day 2 32
//fun main(){
//    val str = "abcd"
//    println(str.uppercase())    //String Function
//// ABCD
//    println(str)     //orijnal string
//// abcd
//
//    val s = "abc" + 1
//    println(s + "def")
//// abc1def
//}

////Day 2 33
//fun main(){
//    var age=12
//    if(age>=18){
//        println("age is 18+")
//    }
//    else{
//        println("you are under age")
//    }
//}

////Day 2 34
//fun main(){
//    var age=0
//    println("Enter you Age ")
//    var enteredValue= readln()
//    age=enteredValue.toInt()
//    if(age>=18){
//        println("age is 18+")
//    }
//    else{
//        println("you are under age")
//    }
//}

////Day 2 35
//fun main(){
//    var a=0
//    var b=0
//    var c=0
//
//    println("Enter 1 number = ")
//    var enteredValue= readln()
//    a=enteredValue.toInt()
//
//    println("Enter 2 number = ")
//    var enteredValue1= readln()
//    b=enteredValue1.toInt()
//
//    println("Enter 3 number = ")
//    var enteredValue2= readln()
//    c=enteredValue2.toInt()
//
//    if (a >= b && a >= c) {
//        println("$a is the greatest")
//    } else if (b >= a && b >= c) {
//        println("$b is the greatest")
//    } else {
//        println("$c is the greatest")
//    }
//
//}

////Day 2 39 (with counter)
//fun main(){
//    var count=0
//
//    while (count<=3){
//        println("count $count")
//        count++
//    }
//    println("Loop is done!!!")
//}

//Day 2 40 (with user i/p)
fun main() {
    var count = 0
    println("Enter number = ")
    val enteredValue = readln().toInt()
    while (count <= enteredValue) {
        println("count $count")
        count++
    }
    println("Loop is done!!!")
}


