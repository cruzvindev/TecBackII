package com.iesp.tecback.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iesp.tecback.enums.FormaPagamento;
import com.iesp.tecback.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
	@Query(value = "SELECT * FROM cliente c WHERE c.cpf LIKE %:clienteCpf%", nativeQuery = true)
    List<Cliente> findByCpf(String clienteCpf);
	
	
	@Query(value = "SELECT * FROM cliente c WHERE c.telefone LIKE %:clienteTelefone%", nativeQuery = true)
    List<Cliente> findByTelefone(String clienteTelefone);


    List<Cliente> findByNomeContainingIgnoreCase(String nome);
	
	 @Query("SELECT c FROM Cliente c WHERE c.endereco.rua LIKE %:nomeRua%")
	public List<Cliente> findByNomeRuaContaining(@Param("nomeRua") String nomeRua);

	@Query("SELECT c FROM Cliente c WHERE c.endereco.bairro LIKE %:nomeBairro%")
	public List<Cliente> findByNomeBairroContaining(@Param("nomeBairro") String nomeBairro);
}
