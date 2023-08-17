package com.example.team_1.chs.exception;

import org.springframework.http.HttpStatus;


public enum ErrorCode {

    //200
    SUCCESS(HttpStatus.OK, "OK"),

    //400
    NOT_SUPPORTED_HTTP_METHOD(HttpStatus.BAD_REQUEST,"지원하지 않는 Http Method 방식입니다."),
    NOT_VALID_METHOD_ARGUMENT(HttpStatus.BAD_REQUEST,"유효하지 않은 Request Body 혹은 Argument입니다."),
    SIGN_UP_FAILED(HttpStatus.BAD_REQUEST,"회원가입에 실패했습니다.");

    private final HttpStatus status;
    private final String message;


    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
