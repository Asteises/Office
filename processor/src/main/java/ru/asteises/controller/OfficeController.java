package ru.asteises.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.asteises.dto.OfficeDTO;
import ru.asteises.entity.Office;
import ru.asteises.service.OfficeService;

@Controller
@Slf4j
public class OfficeController {
    private OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @PostMapping("/office")
    public ResponseEntity<Office> postOffice(@RequestBody OfficeDTO officeDTO) {
        return ResponseEntity.ok(officeService.setOffice(officeDTO));
    }

}
