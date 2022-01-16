package com.gnefedev.todo

interface TodoItemsRepository {
    fun add(item: TodoItem)
    fun delete(id: TodoItem.Id)
    fun getById(id: TodoItem.Id): TodoItem
    fun replace(id: TodoItem.Id, item: TodoItem)
    fun listAll(): Collection<TodoItem>
}
