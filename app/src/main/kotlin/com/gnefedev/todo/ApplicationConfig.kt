package com.gnefedev.todo

import org.koin.dsl.module

val databaseModule = module {
    single<TodoItemsRepository> { InMemoryTodoItemsRepository() }
}

val applicationModule = module {
    single { TodoListService(get()) }
}
