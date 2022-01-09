package com.gnefedev.todo

import java.util.*

data class TodoItem(
    val id: Id,
    val message: String,
    val status: Status = Status.OPEN
) {
    data class Id(
        val uniq: UUID
    ) {
        companion object {
            fun generate() = Id(UUID.randomUUID())
        }
    }

    enum class Status {
        OPEN,
        DONE
    }
}
