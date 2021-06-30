package com.b1a9idps.springasyncdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration(proxyBeanMethods = false)
@EnableAsync
public class WebMvcConfig implements WebMvcConfigurer {
}
