package com.richarddevsuperior.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richarddevsuperior.dsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
