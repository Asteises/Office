package ru.asteises.service;

import org.springframework.stereotype.Service;
import ru.asteises.mappers.HumanMapper;
import ru.asteises.models.dto.HumanDTO;
import ru.asteises.models.entity.Human;
import ru.asteises.repository.HumanRepository;

import java.beans.Transient;
import java.util.List;

@Service
public class HumanService {
    private HumanRepository humanRepository;
    private HumanMapper humanMapper;
    private ProfessionService professionService;

    public HumanService(HumanRepository humanRepository, HumanMapper humanMapper, ProfessionService professionService) {
        this.humanRepository = humanRepository;
        this.humanMapper = humanMapper;
        this.professionService = professionService;
    }

    public void setHuman(HumanDTO humanDTO) {
        Human human = humanMapper.dtoToEntity(humanDTO);
        humanRepository.save(human);
    }

    public List<Human> getAllHumans() {
        return (List<Human>) humanRepository.findAll();
    }

    public Human getHumanById(long id) {
        return humanRepository.findHumanById(id);
    }

    public List<Human> getHumansByAgeBetween(int from, int to) {
        return humanRepository.findHumansByAgeBetween(from, to);
    }

    public List<Human> getHumansByProfession(String professionName) {
        return humanRepository.findHumansByProfessionId(professionService.getProfessionByName(professionName).getId());
    }

    @Transient
    public List<Human> getHumansByIds(List<Long> ids) {
        return humanRepository.findHumanByListId(ids);
    }
}
