package com.example.restdemo.helloworld;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return String.format("HelloWorldBean [message=%s]", message);
    }
}
