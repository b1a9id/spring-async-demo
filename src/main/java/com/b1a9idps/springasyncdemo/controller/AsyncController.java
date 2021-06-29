package com.b1a9idps.springasyncdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.springasyncdemo.dto.response.AsyncResponse;
import com.b1a9idps.springasyncdemo.service.AsyncService;

@RestController
@RequestMapping("/async")
public class AsyncController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncController.class);

    private final AsyncService asyncService;

    public AsyncController(AsyncService asyncService) {
        this.asyncService = asyncService;
    }

    @GetMapping
    public AsyncResponse index() {
        LOGGER.info("Start.");

        asyncService.save();

        return new AsyncResponse("success");
    }
}
