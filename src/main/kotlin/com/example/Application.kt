package com.example

import kotlinx.coroutines.*

fun main() = runBlocking {
    printHello()
    println("printHello() is finished")
}

suspend fun printHello() = coroutineScope {
    val launch1 = launch {
        delay(2000L)
        println("I am second")
    }
    val launch2 = launch {
        delay(1000L)
        println("I am first")
    }
    println("I am before all")
    launch1.join()
    println("I am last in printHello()")
}

