package ru.asteises.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.asteises.service.HumanService;

@Controller
@Slf4j
public class MainController {
    private HumanService humanService;

    @Autowired
    public MainController(HumanService humanService) {
        this.humanService = humanService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        log.debug("Получили запрос по end point hello");
        return ResponseEntity.ok("Hello");
    }

    @GetMapping("/greetings/{text}/test")
    public ResponseEntity<String> getText(@PathVariable String text) {
        log.debug("Получили text из url: {}", text);
        return ResponseEntity.ok(text);
    }

    @GetMapping("/greetings")
    public ResponseEntity<String> getParams(@RequestParam String greeting, @RequestParam String name) {
        log.debug("Получили что-то");
        return ResponseEntity.ok(greeting + ", " + name);
    }

    @PostMapping("/human/{name}")
    public ResponseEntity<String> setHumanName(@PathVariable String name) {
        log.debug("Получили имя для Human");
//        humanService.setHumanName(name);
        return ResponseEntity.ok("OK");
    }
}


