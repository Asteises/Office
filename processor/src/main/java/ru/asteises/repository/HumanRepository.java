package ru.asteises.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.asteises.entity.Human;

import java.util.List;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {
   Human findHumanById(long id);
   List<Human> findHumansByAgeBetween(int from, int to);
   List<Human> findHumansByProfessionId(long id);

    List<Human> findHumansByIdIn(List<Long> id);

    @Query(value = "SELECT * FROM human h WHERE h.human_id IN :ids", nativeQuery = true)
    List<Human> findHumanByListId(@Param("ids") List<Long> ids);

}
