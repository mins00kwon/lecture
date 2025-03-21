package com.ohgiraffers.restapi.section02.responseentity;

import java.util.Map;
import java.util.Objects;

public class ResponseMessage {
    private int httpStatus;                 // 응답 상태 코드값
    private String message;                 // 응답 메세지
    private Map<String, Object> result;     // 응답 데이터

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseMessage{" +
                "httpStatus=" + httpStatus +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseMessage that = (ResponseMessage) o;
        return httpStatus == that.httpStatus && Objects.equals(message, that.message) && Objects.equals(
                result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpStatus, message, result);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    public ResponseMessage(int httpStatus, String message, Map<String, Object> result) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.result = result;
    }

    public ResponseMessage() {
    }
}
