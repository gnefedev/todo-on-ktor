package com.gnefedev.todo

class TodoItemsRepository {
    private val items: MutableMap<TodoItem.Id, TodoItem> = mutableMapOf()

    fun add(item: TodoItem) {
        items[item.id] = item
    }

    fun delete(id: TodoItem.Id) {
        items.remove(id)
    }

    fun getById(id: TodoItem.Id): TodoItem = items.getValue(id)

    fun replace(id: TodoItem.Id, item: TodoItem) {
        items[id] = item
    }

    fun listAll(): Collection<TodoItem> = items.values
}
