package br.com.iesp.datajpa.service;

import br.com.iesp.datajpa.dto.DIsciplinaFormDTO;
import br.com.iesp.datajpa.dto.DisciplinaDTO;
import br.com.iesp.datajpa.entities.Disciplina;

import java.util.Set;

public interface DisciplinaService {

    void incluirDisciplina(DIsciplinaFormDTO form);

    Set<Disciplina> buscarListaDisciplina(Set<Long> ids);
}
