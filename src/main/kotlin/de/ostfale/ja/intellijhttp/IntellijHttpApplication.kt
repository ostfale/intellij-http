package de.ostfale.ja.intellijhttp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IntellijHttpApplication

fun main(args: Array<String>) {
    runApplication<IntellijHttpApplication>(*args)
}
