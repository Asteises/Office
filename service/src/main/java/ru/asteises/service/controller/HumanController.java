package ru.asteises.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    @GetMapping("/human/create/random")
    public Human createRandomHuman() {
        Human human = new Human();
        Profession profession = new Profession();
        profession.setId(101);
        profession.setName("SEO");
        profession.setSalary(100);
        human.setName("Oleg");
        human.setSurname("Tinkof");
        human.setAge(30);
        human.setId(100);
        human.setProfession(profession);
        return human;
    }
}
