package com.gnefedev.todo

import io.ktor.application.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun Application.routing() {
    val todoListService = TodoListService(TodoItemsRepository())

    routing {
        get("/listAll") {
            call.respond(todoListService.listAll())
        }
        put("/add") {
            val todoItem = call.receive<TodoItem>()
            todoListService.add(todoItem)
        }
    }
}
