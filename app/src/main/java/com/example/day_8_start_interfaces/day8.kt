package com.example.day_8_start_interfaces

import com.example.day_8_start_inheritance.Secondary


fun main() {
  val obj1 = BaseClass()
  obj1.coreValue()  // 👉 "Hello from BaseClass"

  val obj2 = Secondary()
  obj2.coreValue()  // 👉 "Hello from Secondary Class"

  val obj3 = Forth()
  obj3.coreValue()  // 👉 "Hello from Secondary Class"
  obj3.archery()    // 👉 "I can shoot arrows"
  obj3.sing()       // 👉 "I can sing"
}
