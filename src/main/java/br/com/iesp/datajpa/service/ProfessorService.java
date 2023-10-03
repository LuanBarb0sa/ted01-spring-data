package br.com.iesp.datajpa.service;

import br.com.iesp.datajpa.dto.ProfessorDTO;
import br.com.iesp.datajpa.dto.ProfessorDTOView;

import java.util.List;

public interface ProfessorService {

    void incluirProfessor(ProfessorDTO form);

    List<ProfessorDTOView> listarProfessor();
}
