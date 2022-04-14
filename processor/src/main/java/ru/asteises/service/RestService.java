package ru.asteises.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.asteises.entity.Human;
import ru.asteises.entity.Office;
import ru.asteises.entity.Profession;

@Service
public class RestService {
    private RestTemplate restTemplate;

    public RestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Human getRandomHuman() {
        return restTemplate.getForObject("http://localhost:8081/human/create/random", Human.class);
    }

    public ResponseEntity<Profession> getRandomProfession() {
        return restTemplate.getForEntity("http://localhost:8081/profession/create/random", Profession.class);
    }

    public Office getRandomOffice() {
        return restTemplate.getForObject("http://localhost:8081/office/create/random", Office.class);
    }
}

//TODO Post запрос в Service - придуамть что отправить и что делать.

/*

Method - GET
URL - http://localhost:8081/human/create/random
Response - Human
...
 */
