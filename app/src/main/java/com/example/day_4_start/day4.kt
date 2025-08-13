package com.example.day_4_start

////Day 4 64,65,66,67,68
//fun main(){
//    val no =listOf(1,2,3,4,5)
//    println(no)
//
//    val no1=mutableListOf(1,2,3,4,5)
//    no1.add(43)
//    no1.remove(2)
//    println(no1)
//
////    Index
//    no1.removeAt(2)
//    println(no1)
//    no1.add(2,34)
//    println(no1)
//    println(no1[3])   //print using index no
//    no1[2]=44         //edit using index
//    println(no1)
//    println("---------------------------------------------------------")
//
//    val no2= mutableListOf(1,2,3,4,5)
//    no2.set(2,34)     //set function use to add element aat given index
//    println(no2)
//
//
//    val numbers = listOf(1, 2, 3, 4, 5)    //contain it is use for check that elemnt was n list or not
//
////    contain method 1 simple
//    println(numbers.contains(3))   // true
//    println(3 in numbers)          // true (shortcut)
//    println(6 in numbers)          // false
//
////  contain method 2 using if else
//    if (numbers.contains(5)) {
//        println("$numbers is in the list.")
//    } else {
//        println("$numbers is NOT in the list.")
//    }
//}



////day 4 Quiz
//fun main() {
//    // Step 1: Creating a Mutable List of Fruits
//    val fruitsList = mutableListOf("Apple", "Banana", "Mango", "Orange", "Grapes")
//    println("Initial Fruits List: $fruitsList")
//
//    // Step 2: Adding a New Fruit
//    fruitsList.add("Pineapple") // Add new fruit
//    println("After Adding Pineapple: $fruitsList")
//
//    // Step 3: Removing a Fruit
//    fruitsList.remove("Banana") // Remove banana from list
//    println("After Removing Banana: $fruitsList")
//
//    // Step 4: Checking if a Specific Fruit Exists
//    val fruitToCheck = "Mango"
//    if (fruitsList.contains(fruitToCheck)) {
//        println("$fruitToCheck is in the list.")
//    } else {
//        println("$fruitToCheck is NOT in the list.")
//    }
//}

////Day 4 69
//fun main(){
//    val no =listOf(1,2,3,4,5)
//    for (i in no){
//        if (i==3){
//            break
//        }
//        println(i)
//    }
//}

////Day 4 70 (using withIndex())
//fun main() {
//    val fruitsList = listOf("Apple", "Banana", "Mango", "Orange")
//
//    // Loop with index and value
//    for ((index, fruit) in fruitsList.withIndex()) {
//        println("Index: $index, Fruit: $fruit")
//    }
//}


////Day 4 70 (using indices)
//fun main() {
//    val fruitsList = listOf("Apple", "Banana", "Mango", "Orange")
//
//    for (i in fruitsList.indices) {
//        println("Index: $i, Fruit: ${fruitsList[i]}")
//    }
//}


//Day 4 Quiz

fun main() {
    // Step 1: Create a Mutable List of Integers
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    println("Original List: $numbers") // Printing initial list

    // Step 2: Loop Through the List using index
    for (index in 0 until numbers.size) {
        // Step 3: Double Each Number
        numbers[index] = numbers[index] * 2
    }

    // Step 4: Print the Modified List
    println("Modified List (Doubled Values): $numbers")
}