package br.com.iesp.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iesp.datajpa.service.AlunoService;

@RestController
@RequestMapping("v1/aluno")
public class AlunoController {
	
	private AlunoService alunoService;

	@Autowired
	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	

}
