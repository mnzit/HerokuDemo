package com.nepalaya.herokudemo.service;

import com.nepalaya.herokudemo.dto.Response;
import com.nepalaya.herokudemo.request.CreateTodoRequest;

public interface TodoService {

    Response create(CreateTodoRequest request);

    Response getAll();
}
