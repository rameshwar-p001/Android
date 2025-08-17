package com.example.day_8_start_interfaces


class Forth : Secondary(), Archery, Singing {
    override fun archery() {
        super.archery()
        println("I can shoot arrows")
    }

    override fun sing() {
        super.sing()
        println("I can sing")
    }
}
