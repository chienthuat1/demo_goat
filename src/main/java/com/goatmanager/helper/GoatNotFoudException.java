package com.goatmanager.helper;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GoatNotFoudException extends RuntimeException {
    public GoatNotFoudException(String message) {
        super(message);
    }

}
