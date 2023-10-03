package br.com.iesp.datajpa.dto;

import br.com.iesp.datajpa.entities.Disciplina;
import br.com.iesp.datajpa.entities.Professor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ProfessorDTOView {

    private String nome;
    private Set<DIsciplinaFormDTO> disciplinas = new HashSet<>();

    public static ProfessorDTOView fromEntity(Professor professor){

        var response = new ProfessorDTOView();
        response.setNome(professor.getNome());

        Set<Disciplina> disciplinas = professor.getDisciplinas();
        if(!disciplinas.isEmpty()){
            disciplinas.forEach(dis -> {
                DIsciplinaFormDTO dtoDisciplina = new DIsciplinaFormDTO();
                dtoDisciplina.setDescricao(dis.getDescricao());
                response.getDisciplinas().add(dtoDisciplina);
            });
        }
        return response;
    }
}
