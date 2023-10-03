package br.com.iesp.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iesp.datajpa.dto.AlunoDTO;
import br.com.iesp.datajpa.entities.Aluno;
import br.com.iesp.datajpa.service.AlunoService;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	private AlunoService alunoService;

	@Autowired
	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}
	
	
	
		@PostMapping
		@Transactional
		public ResponseEntity cadastrar(@RequestBody AlunoDTO dados) {
			Aluno aluno = alunoService.cadastrarAluno(dados);
			return ResponseEntity.status(HttpStatus.CREATED).body(aluno);

	}
	
//		@GetMapping
//		public ResponseEntity<List<Aluno>> listarAluno(){
//			List<Aluno> lista = repository.findAll();
//			return ResponseEntity.ok(lista);
//		}
//		
	

}
