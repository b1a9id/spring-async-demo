package com.b1a9idps.springasyncdemo.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public final class AsyncRequest {
    private final int number;

    @JsonCreator
    public AsyncRequest(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
