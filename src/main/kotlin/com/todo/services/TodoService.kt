package com.todo.services

import com.todo.models.TodoItem
import com.todo.repositories.TodoRepository
import org.springframework.stereotype.Service

/**
 * Created by joshhorecny on 7/22/17.
 */
interface TodoService {
    fun getAllTodoItems(): List<TodoItem>
    fun getTodoItem(id: Int): TodoItem
    fun saveTodoItem(todoItem: TodoItem): TodoItem
    fun updateTodoItem(todoItem: TodoItem): TodoItem
    fun deleteTodoItem(id: String)
}

@Service
class TodoServiceImpl (val todoRepository: TodoRepository) : TodoService {
    override fun getAllTodoItems(): List<TodoItem> {
       return todoRepository.findAll()
    }

    override fun getTodoItem(id: Int): TodoItem {
        return todoRepository.findByTodoNumber(id)
    }

    override fun saveTodoItem(todoItem: TodoItem): TodoItem {
        return todoRepository.save(todoItem)
    }

    override fun updateTodoItem(todoItem: TodoItem): TodoItem {
        return todoRepository.save(todoItem)
    }

    override fun deleteTodoItem(id: String) {
        todoRepository.delete(id)
    }
}