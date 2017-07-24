package com.todo.repositories

import com.todo.models.TodoItem
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * Created by joshhorecny on 7/22/17.
 */

@Repository
interface TodoRepository : MongoRepository<TodoItem, String> {
    fun findByTodoNumber(todoNumber: Int): TodoItem
}