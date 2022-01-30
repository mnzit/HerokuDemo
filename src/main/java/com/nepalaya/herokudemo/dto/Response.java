package com.nepalaya.herokudemo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Response implements Serializable {

    private Boolean result;
    private String description;
    private Object data;

    public Response buildSuccess(String description, Object data){
        this.result = true;
        this.description = description;
        this.data = data;
        return this;
    }

    public Response buildSuccess(String description){
        this.result = true;
        this.description = description;
        return this;
    }
}
