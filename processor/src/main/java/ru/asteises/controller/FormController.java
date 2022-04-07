package ru.asteises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.asteises.models.dto.LoginDTO;
import ru.asteises.models.entity.Human;
import ru.asteises.service.HumanService;

import java.util.List;

@Controller
public class FormController {
    private HumanService humanService;

    public FormController(HumanService humanService) {
        this.humanService = humanService;
    }

    @GetMapping("/")
    public String home() {
        return "form";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDTO loginDTO, Model model) {
        loginDTO.setPassword(null);
        model.addAttribute("response", loginDTO);
        return "login";
    }

    @GetMapping("/human/all")
    public String getAllHumans(Model model) {
        List<Human> humans = humanService.getAllHumans();
        model.addAttribute("humans", humans);
        return "allhumans";
    }
}
