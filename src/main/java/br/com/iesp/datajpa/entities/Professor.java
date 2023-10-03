package br.com.iesp.datajpa.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_professor", schema = "datajpa")
public class Professor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;

	@ManyToMany(mappedBy = "professores")
	private Set<Disciplina> disciplinas = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "universidade_id")
    private Universidade universidade;

}
