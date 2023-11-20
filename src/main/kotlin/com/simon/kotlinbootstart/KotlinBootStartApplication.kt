package com.simon.kotlinbootstart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBootStartApplication

fun main(args: Array<String>) {
    runApplication<KotlinBootStartApplication>(*args)
}
