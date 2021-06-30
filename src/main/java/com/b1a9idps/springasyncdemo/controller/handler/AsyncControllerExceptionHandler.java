package com.b1a9idps.springasyncdemo.controller.handler;

import java.util.concurrent.RejectedExecutionException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.b1a9idps.springasyncdemo.dto.response.ErrorResponse;

@RestControllerAdvice(basePackageClasses = com.b1a9idps.springasyncdemo.controller.AsyncController.class)
public class AsyncControllerExceptionHandler {

    @ExceptionHandler(RejectedExecutionException.class)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public ErrorResponse handleRejectedExecutionException(RejectedExecutionException e) {
        return new ErrorResponse("too busy...");
    }
}
