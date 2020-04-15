package com.okta.kotlin.Azul

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AzulApplication

fun main(args: Array<String>) {
	runApplication<AzulApplication>(*args)
}
