package br.com.iesp.datajpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.iesp.datajpa.dto.AlunoDTO;
import br.com.iesp.datajpa.entities.Aluno;
import br.com.iesp.datajpa.repositories.AlunoRepository;
import br.com.iesp.datajpa.service.AlunoService;
import jakarta.transaction.Transactional;

public class AlunoServiceImpl implements AlunoService{

	@Autowired
	AlunoRepository repository;

	@Transactional
	public Aluno cadastrarAluno(AlunoDTO dados) {
		Aluno aluno = new Aluno();
		aluno.setNome(dados.getNome());
		aluno.setProfessor(dados.getProfessor());
		aluno.setUniversidade(dados.getUniversidade());
		
		repository.save(aluno);
		return aluno;
	}
	
	
}

