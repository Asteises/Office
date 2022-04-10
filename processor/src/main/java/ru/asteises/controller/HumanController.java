package ru.asteises.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.asteises.models.dto.HumanDTO;
import ru.asteises.models.entity.Human;
import ru.asteises.service.HumanService;
import ru.asteises.service.RestService;

import java.util.List;

@Controller
@Slf4j
public class HumanController {
    private HumanService humanService;
    private RestService restService;

    public HumanController(HumanService humanService, RestService restService) {
        this.humanService = humanService;
        this.restService = restService;
    }

    @PostMapping("/human")
    public ResponseEntity<HumanDTO> postHuman (@RequestBody HumanDTO humanDTO) {
        humanService.setHuman(humanDTO);
        return ResponseEntity.ok(humanDTO);
    }

    @GetMapping("/human")
    public ResponseEntity<List<Human>> getAllHumans() {
        return ResponseEntity.ok(humanService.getAllHumans());
    }

    @GetMapping("/human/{id}")
    public ResponseEntity<Human> getHumanById(@PathVariable long id) {
        return ResponseEntity.ok(humanService.getHumanById(id));
    }

    @GetMapping("/human/between")
    public ResponseEntity<List<Human>> getHumanBetweenAge(@RequestParam int from, @RequestParam int to) {
        return ResponseEntity.ok(humanService.getHumansByAgeBetween(from, to));
    }

    @GetMapping("/human/profession/{profession}")
    public ResponseEntity<List<Human>> getHumansByProfession(@PathVariable String profession) {
        return ResponseEntity.ok(humanService.getHumansByProfession(profession));
    }

    @GetMapping("/human/random")
    public ResponseEntity<Human> createRandomHuman() {
        return ResponseEntity.ok(restService.getRandomHuman());
    }

}