package com.gnefedev.todo

class TodoListService(
    private val repository: TodoItemsRepository
) {

    fun add(item: TodoItem) {
        repository.add(item)
    }

    fun delete(id: TodoItem.Id) {
        repository.delete(id)
    }

    fun markDone(id: TodoItem.Id) {
        val original = repository.getById(id)
        val edited = original.copy(status = TodoItem.Status.DONE)
        repository.replace(id, edited)
    }

    fun listAll(): Collection<TodoItem> = repository.listAll()
}
