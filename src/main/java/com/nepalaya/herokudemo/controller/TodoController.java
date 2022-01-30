package com.nepalaya.herokudemo.controller;

import com.nepalaya.herokudemo.dto.Response;
import com.nepalaya.herokudemo.request.CreateTodoRequest;
import com.nepalaya.herokudemo.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public Response getAll() {
        return todoService.getAll();
    }

    @PostMapping
    public Response save(@Valid @RequestBody CreateTodoRequest request) {
        return todoService.getAll();
    }
}
