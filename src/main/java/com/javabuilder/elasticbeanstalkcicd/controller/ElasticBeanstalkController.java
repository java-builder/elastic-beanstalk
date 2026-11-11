package com.javabuilder.elasticbeanstalkcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elasticbeanstalk")
public class ElasticBeanstalkController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/status")
    public String status() {
        return "Running";
    }

    @GetMapping
    public String defaultEndpoint() {
        return "Default endpoint";
    }

    @GetMapping("/version")
    public String version() {
        return "2.0.0";
    }

    @GetMapping("/env")
    public String env() {
        return "prod";
    }

    @GetMapping("/home")
    public String home () {
        return "Hello Elastic Beanstalk Production";
    }
}
