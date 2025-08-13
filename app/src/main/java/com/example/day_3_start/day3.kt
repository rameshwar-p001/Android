package com.example.day_3_start

////day 3 45
////pre define function
//fun main(){
////    call function
//    makeCoffe()
//}
//
////userdefine function
//fun makeCoffe(){
//    println("hello world form make coffe fun which are userdefine ")
//}

////Day 3 46
////Function with parameter
//fun main() {
//    makeCoffe(sugar = 1)
//    makeCoffe(sugar = 2)
//    makeCoffe(sugar = 3)
//}
//
//fun makeCoffe(sugar: Int) {
//    println("Make coffee and add $sugar sugar")
//}


////Day 3
////quize 8
//
//fun main() {
//    makeCoffee(1)
//    makeCoffee(2)
//    makeCoffee(0)
//    makeCoffee(-1)
//}
//
//fun makeCoffee(sugarCount: Int) {
//    if (sugarCount == 1) {
//        println("Coffee with 1 spoon of sugar")
//    } else {
//        println("Coffee with $sugarCount spoons of sugar")
//    }
//}

////Day 3
////quize 9
//
//fun main() {
//    makeCoffee("Jimmy", 2)
//    makeCoffee("Sara", 1)
//    makeCoffee("Alex", 0)
//    makeCoffee("Ravi", -1) // Extra test: negative sugar
//}
//
//fun makeCoffee(name: String, sugarCount: Int) {
//    if (sugarCount == 0) {
//        println("Coffee with no sugar for $name")
//    } else if (sugarCount == 1) {
//        println("Coffee with 1 spoon of sugar for $name")
//    } else {
//        println("Coffee with $sugarCount spoons of sugar for $name")
//    }
//}

////Day 3 50
//fun main() {
//    val result = add(45, 3)
//    println("Sum is: $result")
//}
//
//fun add(a: Int, b: Int): Int {
//    val c = a + b
//    return c
//}


////Day 3
////quize 9
//fun main() {
//    // Step 1: Gather User Input
//    print("Enter first number: ")
//    val num1 = readLine()!!.toInt()  // Step 2: Convert to Integer
//
//    print("Enter second number: ")
//    val num2 = readLine()!!.toInt()  // Step 2: Convert to Integer
//
//    // Step 3: Use the Add Function
//    val result = add(num1, num2)
//
//    // Step 4: Display the Result
//    println("The result of $num1 + $num2 is: $result")
//}
//
//// Function to add two integers
//fun add(a: Int, b: Int): Int {
//    return a + b
//}


////Day 3 55 (class)
////class was alredy created classes2ndday
//
//fun main(){
//    var p= classes2ndday()
//}

////Day 3 56 (constructor)
//fun main(){
//    var p= classes2ndday("mukund")
//}

////Day 3 56 (primary constructor)
//fun main() {
//    val car1 = classes2ndday("Toyota", 2023)
//}

////Day 3 56 (secondary constructor)
//fun main() {
//    val car1 = classes2ndday("Toyota", 2023)
//    println("${car1.brand} - ${car1.year}")
//}


////Day 3
////Quize
//fun main() {
//    // Step 3: Create instance using default values
//    val myBook = classes2ndday()  // No arguments passed, defaults will be used
//    println("My Book -> Title: ${myBook.title}, Author: ${myBook.author}, Year: ${myBook.yearPublished}")
//
//    println("----------------------------------")
//
//    // Step 4: Create instance with custom values
//    val customBook = classes2ndday("Atomic Habits", "James Clear", 2018)
//    println("Custom Book -> Title: ${customBook.title}, Author: ${customBook.author}, Year: ${customBook.yearPublished}")
//}

//Day 3 58
// Using data class
fun main() {
    // 1️⃣ Default values wala object
    val student1 = day3class()
    println(student1) // Auto toString()

    // 2️⃣ Custom values wala object
    val student2 = day3class("Ramesh", 1, "A")
    println(student2)

    // 3️⃣ Copy with changes
    val student3 = student2.copy(name = "Suresh")
    println(student3)

    // 4️⃣ Destructuring
    val (name, roll, grade) = student3
    println("Name: $name, Roll: $roll, Grade: $grade")
}
