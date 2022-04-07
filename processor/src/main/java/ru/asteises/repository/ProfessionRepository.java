package ru.asteises.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.models.entity.Profession;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Long> {
    Profession findProfessionById(long id);
    Profession findProfessionByName(String professionName);
}