package com.example.project_on_kotli.rockpaper

fun main() {
    var computer=""
    var player=""

    println("Rock , Paper , scissor ? enter your choice ")
    player= readln()

    var random =(1..3).random()

    when (random) {
        1 -> {
            computer="rock"
        }
        2 -> {
            computer="paper"
        }
        3 -> {
            computer="scissor"
        }
    }
    println(computer)

    val winner= when {
        player==computer -> "tie"
        player== "rock" && computer== "scissor" -> player
        player== "paper" && computer== "rock" -> player
        player== "scissor" && computer== "paper" -> player
        else->"computer"
    }
    if (winner=="tie"){
        println("It's a tie")
    }
//    else if(winner=="player"){
//        println("Player wonnnnnnnn")
//    }
    else{
        println("$winner won...")
    }
}