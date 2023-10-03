package br.com.iesp.datajpa.service.impl;

import br.com.iesp.datajpa.dto.DisciplinaDTO;
import br.com.iesp.datajpa.dto.ProfessorDTO;
import br.com.iesp.datajpa.dto.ProfessorDTOView;
import br.com.iesp.datajpa.entities.Disciplina;
import br.com.iesp.datajpa.entities.Professor;
import br.com.iesp.datajpa.repositories.ProfessorRepository;
import br.com.iesp.datajpa.service.DisciplinaService;
import br.com.iesp.datajpa.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    ProfessorRepository repository;

    @Autowired
    DisciplinaService disciplinaService;
    @Override
    public void incluirProfessor(ProfessorDTO form) {

        Professor professor = new Professor();
        professor.setNome(form.getNome());

        Set<DisciplinaDTO> dIsciplinaDTOSet = form.getDisciplinas();
        Set<Long> disciplinasIds = dIsciplinaDTOSet
                .stream()
                .map(DisciplinaDTO::getIdDisciplina)
                .collect(Collectors.toSet());

        Set<Disciplina> disciplina = disciplinaService.buscarListaDisciplina(disciplinasIds);

        if(!disciplina.isEmpty()){
            disciplina.forEach(disciplina1 -> {
                Disciplina dis = new Disciplina();
                dis.setDescricao(disciplina1.getDescricao());
                dis.setId(disciplina1.getId());

                professor.getDisciplinas().add(dis);
            });
        }

        repository.save(professor);

    }

    @Override
    public List<ProfessorDTOView> listarProfessor() {

        List<Professor> listProfessor = repository.findAll();
        List<ProfessorDTOView> listaRetorno = listProfessor.
                stream().map(ProfessorDTOView::fromEntity)
                .collect(Collectors.toList());

        return listaRetorno;
    }
}
