package com.OpmBackendApplication.exceptions;

public class OpmException extends RuntimeException {
    public OpmException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public OpmException(String exMessage) {
        super(exMessage);
    }
}
