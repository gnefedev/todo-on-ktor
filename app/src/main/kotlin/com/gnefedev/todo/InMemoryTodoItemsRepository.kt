package com.gnefedev.todo

class InMemoryTodoItemsRepository : TodoItemsRepository {
    private val items: MutableMap<TodoItem.Id, TodoItem> = mutableMapOf()

    override fun add(item: TodoItem) {
        items[item.id] = item
    }

    override fun delete(id: TodoItem.Id) {
        items.remove(id)
    }

    override fun getById(id: TodoItem.Id): TodoItem = items.getValue(id)

    override fun replace(id: TodoItem.Id, item: TodoItem) {
        items[id] = item
    }

    override fun listAll(): Collection<TodoItem> = items.values
}
