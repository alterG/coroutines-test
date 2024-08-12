package com.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

private const val rowLength = 220

fun main() = runBlocking {
    for (i in 1..50_000) {
        if (i % rowLength == 0) {
            println()
            delay(1)
        }
        launch {
            print(".")
        }
    }
}