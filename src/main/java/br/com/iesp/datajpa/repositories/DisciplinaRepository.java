package br.com.iesp.datajpa.repositories;

import br.com.iesp.datajpa.dto.DisciplinaDTO;
import br.com.iesp.datajpa.entities.Disciplina;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    @Query(value = "SELECT * FROM datajpa.tb_disciplina d WHERE d.id IN :disciplinaIds", nativeQuery = true)
    Set<Disciplina> findDisciplinasByIds(@Param("disciplinaIds") Set<Long> disciplinaIds);

}
