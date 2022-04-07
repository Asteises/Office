package ru.asteises.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.asteises.dto.HumanDTO;
import ru.asteises.dto.ProfessionDTO;
import ru.asteises.entity.Profession;
import ru.asteises.mappers.ProfessionMapper;
import ru.asteises.repository.ProfessionRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfessionService {
    private ProfessionRepository professionRepository;
    private ProfessionMapper professionMapper;

    @Autowired
    public ProfessionService(ProfessionRepository professionRepository, ProfessionMapper professionMapper) {
        this.professionRepository = professionRepository;
        this.professionMapper = professionMapper;
    }

    public void setProfession(ProfessionDTO professionDTO) {
        Profession profession = professionMapper.dtoToEntity(professionDTO);
        professionRepository.save(profession);
    }

    public Profession getProfessionById(long id) {
       return professionRepository.findProfessionById(id);
    }

    public List<Profession> getAllProfessions() {
        return professionRepository.findAll();
    }

    public Profession getProfessionByName(String name) {
        return professionRepository.findProfessionByName(name);
    }

    public Profession getProfessionHighestSalary() {
        List<Profession> professionList = professionRepository.findAll();
        return professionList.stream().sorted(Comparator.comparing(Profession::getSalary).reversed()).findFirst().get();
    }
}
