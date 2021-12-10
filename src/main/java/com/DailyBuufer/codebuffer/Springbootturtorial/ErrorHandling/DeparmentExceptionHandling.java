package com.DailyBuufer.codebuffer.Springbootturtorial.ErrorHandling;

public class DeparmentExceptionHandling extends Exception {

    public DeparmentExceptionHandling() {
        super();
    }

    public DeparmentExceptionHandling(String message) {
        super(message);
    }

    public DeparmentExceptionHandling(String message, Throwable cause) {
        super(message, cause);
    }

    public DeparmentExceptionHandling(Throwable cause) {
        super(cause);
    }

    protected DeparmentExceptionHandling(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
