package br.com.iesp.datajpa.dto;

import br.com.iesp.datajpa.entities.Disciplina;
import br.com.iesp.datajpa.entities.Professor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ProfessorDTO {

    private String nome;
    private Set<DisciplinaDTO> disciplinas = new HashSet<>();
}
