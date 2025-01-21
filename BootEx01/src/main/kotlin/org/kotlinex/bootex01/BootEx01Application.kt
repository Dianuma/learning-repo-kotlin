package org.kotlinex.bootex01

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootEx01Application

fun main(args: Array<String>) {
    runApplication<BootEx01Application>(*args)
}
