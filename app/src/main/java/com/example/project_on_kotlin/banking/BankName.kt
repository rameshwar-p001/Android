package com.example.project_on_kotlin.banking

fun main(){
    val rdp=BankAccount("Rameshwar",1000.0)
    println("Account Holder: ${rdp.accountHolder}")
    rdp.deposit(2000.00)
    rdp.withdraw(500.00)
    rdp.displayTransectionHistory()

    println("${rdp.accountHolder} balance is ${rdp.balance}")
}