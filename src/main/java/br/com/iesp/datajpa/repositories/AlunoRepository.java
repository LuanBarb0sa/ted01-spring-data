package br.com.iesp.datajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.iesp.datajpa.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
