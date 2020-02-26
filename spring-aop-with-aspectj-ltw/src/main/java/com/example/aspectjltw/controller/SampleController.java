package com.example.aspectjltw.controller;

import com.example.aspectjltw.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {

        this.sampleService = sampleService;
    }

    @GetMapping("/sample")
    public String get() {

        return sampleService.proceed("original");
    }
}
