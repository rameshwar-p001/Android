package com.example.day_8_start_inheritance

////now i access the baseclass
//// thats way i wass writen there "open BaseClass()"
////It is Basiicaly derived class of base class
////inherits form baseclass

////It is for 2 level
//
//class Secondary: BaseClass() {
////    we will access the baseclass methods
//
//    override fun role() {
//        super.role()
//        println("Hello I am Secondary class ")
//    }
//}

//=--------------------------------------------------------------------------------------------------------------------
//In this we use files - 1] BaseClass.kt, 2] Secondary.kt, 3]Teretery 4] main file day8.kt
//Now for 3 level

class Secondary : BaseClass() {
    override fun role() {
        super.role()
        println("Hello I am Secondary class ")
    }
}
