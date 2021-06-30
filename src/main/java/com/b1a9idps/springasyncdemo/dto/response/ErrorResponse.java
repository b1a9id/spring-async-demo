package com.b1a9idps.springasyncdemo.dto.response;

public final class ErrorResponse {
    private final String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
