package com.alexshay.shape.task.servise.exception;

public class ParametrException extends Exception {
    public ParametrException() {
        super();
    }

    public ParametrException(String message) {
        super(message);
    }

    public ParametrException(String message, Exception cause) {
        super(message, cause);
    }
}
