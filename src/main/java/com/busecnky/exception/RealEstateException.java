package com.busecnky.exception;

import lombok.Getter;

@Getter
public class RealEstateException extends RuntimeException{
    private final ErrorType errorType;

    public RealEstateException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public RealEstateException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}
