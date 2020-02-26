package com.example.aspectjltw.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SampleService {

    public String proceed(String value) {

        return value + " " + proceedInternal(value);
    }

    private String proceedInternal(String value) {

        log.info("Lombok doesn't clash with weaved method: " + value);
        return value;
    }
}
