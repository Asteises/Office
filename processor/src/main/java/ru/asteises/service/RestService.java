package ru.asteises.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
    private final RestTemplate template;

    public RestService(RestTemplate template) {
        this.template = template;
    }
}
