package br.com.iesp.datajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iesp.datajpa.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
