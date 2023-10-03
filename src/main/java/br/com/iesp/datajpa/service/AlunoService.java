package br.com.iesp.datajpa.service;

import br.com.iesp.datajpa.dto.AlunoDTO;
import br.com.iesp.datajpa.entities.Aluno;

public interface AlunoService {
	public Aluno cadastrarAluno(AlunoDTO dados);
}
