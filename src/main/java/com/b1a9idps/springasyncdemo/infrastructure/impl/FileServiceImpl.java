package com.b1a9idps.springasyncdemo.infrastructure.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.b1a9idps.springasyncdemo.exception.FailedFileUploadException;
import com.b1a9idps.springasyncdemo.infrastructure.FileService;

@Service
public class FileServiceImpl implements FileService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileServiceImpl.class);

    @Override
    public void upload() {
        LOGGER.info("try upload.");
        if (true) {
            throw new FailedFileUploadException("file upload failed.");
        }
    }
}
