package com.gnefedev.todo

import org.koin.dsl.module

val testModule = module {
    single<TodoItemsRepository> { InMemoryTodoItemsRepository() }
}
