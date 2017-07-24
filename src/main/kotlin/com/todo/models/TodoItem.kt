package com.todo.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by joshhorecny on 7/22/17.
 */
@Document(collection = "TodoCollection")
data class TodoItem(@Id val id: String? = null, val todoNumber: Int, val message: String, val complete: Boolean)