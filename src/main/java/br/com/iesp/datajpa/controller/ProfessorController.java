package br.com.iesp.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iesp.datajpa.service.ProfessorService;

@RestController
@RequestMapping("v1/professor")
public class ProfessorController {
	
	private ProfessorService professorService;

	
	@Autowired
	public ProfessorController(ProfessorService professorService) {
		this.professorService = professorService;
	}

	
	
}
