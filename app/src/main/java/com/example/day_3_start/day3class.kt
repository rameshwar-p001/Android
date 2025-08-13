package com.example.day_3_start

////day 3 55
//class cday3class {
//
//    init {
//        bark()
//    }
//    fun bark(){
//        println("meau meauu")
//    }
//}

////Day 3 56
//class day3class(name: String) {
//
//    init {
//        bark(name)
//    }
//    fun bark(name: String){
//        println("$name Dukkkar ")
//    }
//}

////Day 3 56 (primary constructor)
//class day3class(val brand: String, val year: Int) {
//    init {
//        println("Car created: $brand ($year)")
//    }
//}

////Day 3 56 (secondary constructor)
//class day3class {
//    var brand: String
//    var year: Int
//
//    constructor(brand: String, year: Int) {
//        this.brand = brand
//        this.year = year
//    }
//}


////Day 3 quize
//// Step 1 & 2: Define class Book with primary constructor and default values
//class day3class(
//    var title: String = "Stop over thinking",          // Default title
//    var author: String = "James Clear",       // Default author
//    var yearPublished: Int = 2025            // Default year (current year)
//) {
//    // init block to confirm object creation
//    init {
//        println("Book object created: $title by $author, published in $yearPublished")
//    }
//}


// Using data class
data class day3class(
    val name: String = "Unknown",
    val rollNo: Int = 0,
    val grade: String = "Not Assigned"
)