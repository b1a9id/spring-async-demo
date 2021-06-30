package com.b1a9idps.springasyncdemo.service;

import com.b1a9idps.springasyncdemo.dto.request.AsyncRequest;

public interface AsyncService {
    void save(AsyncRequest request);
}
