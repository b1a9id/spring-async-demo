package com.b1a9idps.springasyncdemo.exception;

public class FailedFileUploadException extends RuntimeException {

    public FailedFileUploadException(String message) {
        super(message);
    }
}
