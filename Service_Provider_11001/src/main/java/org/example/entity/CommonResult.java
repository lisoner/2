package org.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonResult <T> implements Serializable {
    private Integer code;

    private  String message;

    private T result;
}
