package com.wuhen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 2020/7/24 17:37
 * by 无痕ぐ
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    public NotFoundException(){

    }
    public NotFoundException(String message){
        super(message);

    }
    public NotFoundException(String message,Throwable cause){

        super(message,cause);

    }
}
