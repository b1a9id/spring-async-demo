package com.b1a9idps.springasyncdemo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.b1a9idps.springasyncdemo.service.AsyncService;

@Service
public class AsyncServiceImpl implements AsyncService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncServiceImpl.class);

    @Override
    @Async
    public void save() {
        LOGGER.info("Start Async processing.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            LOGGER.error("thrown InterruptedException.");
        }

        LOGGER.info("End Async processing.");
    }
}
