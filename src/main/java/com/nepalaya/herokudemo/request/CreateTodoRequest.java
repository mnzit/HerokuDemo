package com.nepalaya.herokudemo.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
public class CreateTodoRequest implements Serializable {

    @NotEmpty
    private String description;
}
