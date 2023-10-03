package br.com.iesp.datajpa.dto;

import br.com.iesp.datajpa.entities.Professor;
import br.com.iesp.datajpa.entities.Universidade;
import lombok.Data;

@Data
public class AlunoDTO {

	private String nome;
	
	private Professor professor;
	
	private Universidade universidade;
	
	public AlunoDTO() {
		
	}
}
