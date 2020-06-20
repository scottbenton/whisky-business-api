package dev.scottbenton.whiskybusiness

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WhiskyBusinessApplication

fun main(args: Array<String>) {
	runApplication<WhiskyBusinessApplication>(*args)
}
