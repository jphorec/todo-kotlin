package com.todo.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

/**
 * Created by joshhorecny on 7/22/17.
 */
@EnableAutoConfiguration
@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(TodoController::class),
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodoControllerTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun whenCalled_shouldReturnHello() {
        val result = testRestTemplate
                // ...
                .getForEntity("/todo-service/todos", List::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
    }
}