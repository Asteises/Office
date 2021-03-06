package ru.asteises.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.entity.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Long> {

}
