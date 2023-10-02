package br.com.iesp.datajpa.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_aluno", schema = "datajpa")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Aluno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "universidade_id")
    private Universidade universidade;

}
