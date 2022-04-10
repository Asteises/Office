package ru.asteises.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.asteises.models.entity.Human;

@Service
public class RestService {
    private final RestTemplate template;
    private final String serverURL = "http://localhost:8081";

    public RestService(RestTemplate template) {
        this.template = template;
    }

    public Human getRandomHuman() {
        Human human = template.getForObject(serverURL+"/human/create/random", Human.class);
        return human;
    }
}
