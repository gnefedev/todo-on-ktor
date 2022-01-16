package com.gnefedev.todo

import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Application.routing() {
    val todoListService by inject<TodoListService>()

    routing {
        get("/listAll") {
            call.respond(todoListService.listAll().toList())
        }
        put("/add") {
            val todoItem = call.receive<TodoItem>()
            todoListService.add(todoItem)
        }
    }
}
