package ru.asteises.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OfficeController {
    HumanController humanController;

    @GetMapping("office/create/random")
    public Office createRandomOffice() {
        Office office = new Office();
        office.setAddress("Dmitrovskaya 15-1");
        office.setDepartment("Design");
        office.setId(100500);
//        List<Human> humans = new ArrayList<>();
//        humans.add(humanController.createRandomHuman());
        return office;
    }
}
