package com.todo.controllers

import com.todo.models.TodoItem
import com.todo.services.TodoService
import org.springframework.web.bind.annotation.*

/**
 * Created by joshhorecny on 7/22/17.
 */
@CrossOrigin
@RestController
@RequestMapping("/todo-service")
class TodoController (val todoService: TodoService) {

    @GetMapping("/todos")
    fun getTodos(): List<TodoItem> {
        return todoService.getAllTodoItems();
    }

    @GetMapping("/todo/{id}")
    fun getTodo(@PathVariable("id") id: Int): TodoItem {
        return todoService.getTodoItem(id);
    }

    @PostMapping("/todo")
    fun saveTodo(@RequestBody todoItem: TodoItem): TodoItem {
        return todoService.saveTodoItem(todoItem)
    }

    @PutMapping("/todo/{id}")
    fun updateTodo(@RequestBody todoItem: TodoItem): TodoItem {
        return todoService.updateTodoItem(todoItem)
    }
    @DeleteMapping("/todo/{id}")
    fun deleteTodo(@PathVariable id: String) {
        todoService.deleteTodoItem(id)
    }
}
