package ru.asteises.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.asteises.dto.ProfessionDTO;
import ru.asteises.entity.Profession;
import ru.asteises.service.ProfessionService;
import ru.asteises.service.RestService;

import java.util.List;

@Controller
@Slf4j
public class ProfessionController {
    private ProfessionService professionService;
    private RestService restService;

    public ProfessionController(ProfessionService professionService, RestService restService) {
        this.professionService = professionService;
        this.restService = restService;
    }

    /**
     *
     * @param professionDTO
     * @return
     */
    @PostMapping("/profession")
    public ResponseEntity<ProfessionDTO> setProfession(@RequestBody ProfessionDTO professionDTO) {
        professionService.setProfession(professionDTO);
        return ResponseEntity.ok(professionDTO);
    }

    @GetMapping("/profession")
    public ResponseEntity<List<Profession>> getAllProfessions() {
        return ResponseEntity.ok(professionService.getAllProfessions());
    }

    @GetMapping("/profession/{id}")
    public ResponseEntity<Profession> getProfessionById(@PathVariable long id) {
        return ResponseEntity.ok(professionService.getProfessionById(id));
    }

    @GetMapping("/profession/salary")
    public ResponseEntity<Profession> getProfessionBySalary() {
        return ResponseEntity.ok(professionService.getProfessionHighestSalary());
    }

    @GetMapping("/profession/random")
    public ResponseEntity<Profession> getRandomProfession() {
        return restService.getRandomProfession();
    }
}
//TODO Пройтись по проекту и написать комментарии через /**
