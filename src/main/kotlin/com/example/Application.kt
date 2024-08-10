package com.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        printSecondPart()
    }
    print("Hello, Igor, ")
}

private suspend fun printSecondPart() {
    delay(1000L)
    print("from Coroutine.")
}