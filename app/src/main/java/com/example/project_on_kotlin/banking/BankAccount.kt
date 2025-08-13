package com.example.project_on_kotlin.banking

class BankAccount(var accountHolder: String, var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder Deposited $$amount")
//        println("Deposited $amount. New balance: $balance")
    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdraw $$amount")
//            println("Withdrew $amount. New balance: $balance")
        } else {
            println("Insufficient funds. Current balance: $balance")
        }
    }

    fun displayTransectionHistory(){
        println("Transaction History for $accountHolder:")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }
}