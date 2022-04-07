package ru.asteises.mappers;

import org.springframework.stereotype.Service;
import ru.asteises.models.dto.HumanDTO;
import ru.asteises.models.entity.Human;
import ru.asteises.service.ProfessionService;

@Service
public class HumanMapper {
    private ProfessionService professionService;

    public HumanMapper(ProfessionService professionService) {
        this.professionService = professionService;
    }

    public Human dtoToEntity(HumanDTO humanDTO) {
        Human human = new Human();
        human.setName(humanDTO.getName());
        human.setSurname(humanDTO.getSurname());
        human.setAge(humanDTO.getAge());
        human.setProfession(professionService.getProfessionById(humanDTO.getProfessionId()));
        return human;
    }
}
