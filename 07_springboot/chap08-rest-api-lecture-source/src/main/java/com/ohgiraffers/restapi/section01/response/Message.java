package com.ohgiraffers.restapi.section01.response;

import java.util.Objects;

public class Message {
    private int httpStatusCode;
    private String message;

    public Message() {
    }

    @Override
    public String toString() {
        return "Message{" +
                "httpStatusCode=" + httpStatusCode +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Message message1 = (Message) o;
        return httpStatusCode == message1.httpStatusCode && Objects.equals(message, message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpStatusCode, message);
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(int httpStatusCode, String message) {
        this.httpStatusCode = httpStatusCode;
        this.message = message;
    }
}
