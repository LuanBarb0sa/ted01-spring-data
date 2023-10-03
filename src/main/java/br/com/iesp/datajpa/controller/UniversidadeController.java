package br.com.iesp.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iesp.datajpa.dto.UniversidadeDTO;
import br.com.iesp.datajpa.entities.Universidade;
import br.com.iesp.datajpa.service.UniversidadeService;

@RestController
@RequestMapping("v1/universidade")
public class UniversidadeController {
	
	private UniversidadeService universidadeService;

	
	@Autowired
	public UniversidadeController(UniversidadeService universidadeService) {
		this.universidadeService = universidadeService;
	}
	
	@PostMapping
	public ResponseEntity<Universidade> incluir(@RequestBody UniversidadeDTO universidadeDTO) {
		return null;
		
	}
	
	
	
	

}
