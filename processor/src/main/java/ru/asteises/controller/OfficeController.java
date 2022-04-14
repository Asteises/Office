package ru.asteises.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.asteises.dto.OfficeDTO;
import ru.asteises.entity.Office;
import ru.asteises.service.OfficeService;
import ru.asteises.service.RestService;

@Controller
@Slf4j
public class OfficeController {
    private OfficeService officeService;
    private RestService restService;

    public OfficeController(OfficeService officeService, RestService restService) {
        this.officeService = officeService;
        this.restService = restService;
    }

    @PostMapping("/office")
    public ResponseEntity<Office> postOffice(@RequestBody OfficeDTO officeDTO) {
        return ResponseEntity.ok(officeService.setOffice(officeDTO));
    }

    @GetMapping("/office/random")
    public ResponseEntity<Office> createRandomOffice() {
        return ResponseEntity.ok(restService.getRandomOffice());
    }

}
