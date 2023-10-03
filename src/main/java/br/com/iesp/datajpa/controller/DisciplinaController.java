package br.com.iesp.datajpa.controller;

import br.com.iesp.datajpa.dto.DIsciplinaFormDTO;
import br.com.iesp.datajpa.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    DisciplinaService service;

    @PostMapping
    public ResponseEntity<?> incluirDisciplina(@RequestBody DIsciplinaFormDTO formDTO) throws Exception {
        try{
            service.incluirDisciplina(formDTO);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
