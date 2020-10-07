package com.richarddevsuperior.dsclient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.richarddevsuperior.dsclient.entities.Client;
import com.richarddevsuperior.dsclient.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional
	public List<Client> findAll() {
		return repository.findAll();
	}
	
}
