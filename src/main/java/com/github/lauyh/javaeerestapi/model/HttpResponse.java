package com.github.lauyh.javaeerestapi.model;

import java.io.Serializable;

public class HttpResponse<T> implements Serializable {
    private static final long serialVersionUID = 2L;
    private int statusCode;
    private String errorCode;
    private String errorMessage;
    private T data;

    public HttpResponse(){}
    public HttpResponse(int statusCode, String errorCode, String errorMessage, T data) {
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void ok(){
        this.statusCode = 200;
    }

    public void saveOk(){
        this.statusCode = 201;
    }
}
