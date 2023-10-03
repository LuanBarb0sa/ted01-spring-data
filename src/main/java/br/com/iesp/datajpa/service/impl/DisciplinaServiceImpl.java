package br.com.iesp.datajpa.service.impl;

import br.com.iesp.datajpa.dto.DIsciplinaFormDTO;
import br.com.iesp.datajpa.dto.DisciplinaDTO;
import br.com.iesp.datajpa.entities.Disciplina;
import br.com.iesp.datajpa.repositories.DisciplinaRepository;
import br.com.iesp.datajpa.service.DisciplinaService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {

    @Autowired
    DisciplinaRepository repository;
    @Override
    public void incluirDisciplina(DIsciplinaFormDTO form) {

        Disciplina disciplina = new Disciplina();
        disciplina.setDescricao(form.getDescricao());

        repository.save(disciplina);
    }

    @Override
    public Set<Disciplina> buscarListaDisciplina(Set<Long> ids) {
        return repository.findDisciplinasByIds(ids);
    }
}
