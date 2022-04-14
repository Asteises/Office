package ru.asteises.mappers;

import org.springframework.stereotype.Service;
import ru.asteises.dto.ProfessionDTO;
import ru.asteises.entity.Profession;

@Service
public class ProfessionMapper {

    public Profession dtoToEntity(ProfessionDTO professionDTO) {
        Profession profession = new Profession();
        profession.setName(professionDTO.getName());
        profession.setSalary(professionDTO.getSalary());
        return profession;
    }
}
