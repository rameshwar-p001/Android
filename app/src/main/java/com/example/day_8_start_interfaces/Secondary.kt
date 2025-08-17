package com.example.day_8_start_interfaces

import com.example.day_8_start_inheritance.BaseClass

//open class Secondary : BaseClass() {
//    override fun role() {
//        super.role()
//        println("Hello I am Secondary class ")
//    }
//}

open class Secondary : BaseClass() {
    override fun coreValue() {   // ab override work karega
        println("Hello from Secondary Class")
    }
}