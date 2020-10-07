package com.richarddevsuperior.dsclient.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.richarddevsuperior.dsclient.dtp.ClientDTO;
import com.richarddevsuperior.dsclient.entities.Client;
import com.richarddevsuperior.dsclient.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		
	}
	
}
