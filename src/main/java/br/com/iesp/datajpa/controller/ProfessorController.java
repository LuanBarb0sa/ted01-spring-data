package br.com.iesp.datajpa.controller;

import br.com.iesp.datajpa.dto.ProfessorDTO;
import br.com.iesp.datajpa.dto.ProfessorDTOView;
import br.com.iesp.datajpa.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/professor")
@RestController
public class ProfessorController {

    @Autowired
    ProfessorService service;

    @PostMapping
    public ResponseEntity<?> incluirProfessor(@RequestBody ProfessorDTO form){
        try{
            service.incluirProfessor(form);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<?> listarTodos(){
        try{
            List<ProfessorDTOView> retorno = service.listarProfessor();
            return ResponseEntity.ok(retorno);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
