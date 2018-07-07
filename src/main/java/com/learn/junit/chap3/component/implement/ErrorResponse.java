package com.learn.junit.chap3.component.implement;

import com.learn.junit.chap3.component.Request;
import com.learn.junit.chap3.component.Response;

public class ErrorResponse implements Response {

    private Request originalRequest;

    private Exception originalException;

    public ErrorResponse(Request originalRequest, Exception originalException) {
        this.originalRequest = originalRequest;
        this.originalException = originalException;
    }

    public Request getOriginalRequest() {
        return originalRequest;
    }

    public Exception getOriginalException() {
        return originalException;
    }
}
