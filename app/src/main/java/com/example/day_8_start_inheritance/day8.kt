package com.example.day_8_start_inheritance

//fun main() {
////    val obj1= BaseClass()
////    obj1.main()        // the fun which we created in the BaseClass
//
//    val obj2 = Secondary()
//    obj2.role()          // for 2 level inheritence
//}


//========================================================================================================
fun main() {

    val obj1 = Secondary()
    obj1.role()

    val obj2 = Teretery()  //In this we use files - 1] BaseClass.kt, 2] Secondary.kt, 3]Teretery 4] main file day8.kt
    obj2.role()
}
