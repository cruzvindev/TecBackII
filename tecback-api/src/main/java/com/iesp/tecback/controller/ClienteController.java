package com.iesp.tecback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iesp.tecback.model.Cliente;
import com.iesp.tecback.repositories.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/search/{nome}")
	public List<Cliente> buscaPorNome(@PathVariable String nome){
	    return clienteRepository.findByNomeContainingIgnoreCase(nome);
	}

	
	@GetMapping("/rua/{nome}")
	public List<Cliente> buscaPorRua(@PathVariable String nome){
		return clienteRepository.findByNomeRuaContaining(nome);
	}

	@GetMapping("/lista/{cpf}")
    public List<Cliente> buscarClientesPorCpf(@PathVariable String cpf) {
        return clienteRepository.findByCpf(cpf);
    }
	
	@GetMapping("/listatelefone/{clienteTelefone}")
    public List<Cliente> buscarClientesPorTelefone(@PathVariable String clienteTelefone) {
        return clienteRepository.findByTelefone(clienteTelefone);
    }

    
}
