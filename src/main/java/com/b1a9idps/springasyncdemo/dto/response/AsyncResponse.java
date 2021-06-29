package com.b1a9idps.springasyncdemo.dto.response;

public final class AsyncResponse {
    private final String message;

    public AsyncResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
