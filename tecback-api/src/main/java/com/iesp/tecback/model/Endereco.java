package com.iesp.tecback.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Endereco {

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	@Column
	public String rua;
	
	@Column
	public String numero;
	
	@Column
	public String bairro;
	
	@Column
	public String cidade;
	
	@Column
	public String cep;
	
	
	
	
}
