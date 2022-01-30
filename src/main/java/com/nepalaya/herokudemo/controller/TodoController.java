package com.nepalaya.herokudemo.controller;

import com.nepalaya.herokudemo.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TodoController {

    @GetMapping
    public List<Todo> getAllTodos(){
        return Arrays.asList(new Todo(1L,"Water the Plants"),new Todo(2L,"Mow the Lawn"));
    }
}
