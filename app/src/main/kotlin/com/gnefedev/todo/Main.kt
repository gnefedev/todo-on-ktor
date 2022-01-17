package com.gnefedev.todo

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.koin.ktor.ext.Koin

fun main() {
    embeddedServer(Netty, port = 8080) {
        install(ContentNegotiation) {
            json()
        }
        install(Koin) {
            modules(
                applicationModule,
                databaseModule
            )
        }
        routing()
    }.start(wait = true)
}
