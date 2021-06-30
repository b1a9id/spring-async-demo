package com.b1a9idps.springasyncdemo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Retryable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.b1a9idps.springasyncdemo.exception.FailedFileUploadException;
import com.b1a9idps.springasyncdemo.infrastructure.FileService;
import com.b1a9idps.springasyncdemo.service.AsyncService;

@Service
public class AsyncServiceImpl implements AsyncService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncServiceImpl.class);

    private final FileService fileService;

    public AsyncServiceImpl(FileService fileService) {
        this.fileService = fileService;
    }

    @Override
    @Retryable(value = FailedFileUploadException.class)
    @Async
    public void save() {
        LOGGER.info("Start Async processing.");

        try {
            Thread.sleep(500);
            fileService.upload();
        } catch (InterruptedException e) {
            LOGGER.error("thrown InterruptedException.");
        }

        LOGGER.info("End Async processing.");
    }
}
