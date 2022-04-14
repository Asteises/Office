package ru.asteises.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessionController {

    @GetMapping("/profession/create/random")
    public ResponseEntity<Profession> createRandomProfession() {
        Profession profession = new Profession();
        profession.setName("Publisher");
        profession.setSalary(500);
        profession.setId(111);
        return ResponseEntity.ok(profession);
    }
}
