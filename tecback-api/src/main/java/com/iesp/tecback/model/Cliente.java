package com.iesp.tecback.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cliente {

	
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public Long id;
	
	@Column
	public String nome;
	
	@Column
	public String cpf;
	
	@Column
	public String telefone;
	
	@OneToOne
	@JoinColumn(name = "cliente_endereco", nullable = false)
	public Endereco endereco;
	
	
}
