package com.basic.snsbasic.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SnsApplicationException extends RuntimeException{

    private ErrorCode errorCode;
    private String message;

    @Override
    public String getMessage() {
        if(message == null) {
            return errorCode.getMessage();
        }
        return String.format("%s. %s",errorCode, getMessage(), message);
    }
}
