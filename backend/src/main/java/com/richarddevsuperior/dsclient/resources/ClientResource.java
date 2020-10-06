package com.richarddevsuperior.dsclient.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richarddevsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Markus", "12831439", 23.00, Instant.now(), 1));
		list.add(new Client(2L, "Margaret", "54242542", 21.00, Instant.now(), 5));
		return ResponseEntity.ok().body(list);
	}
}
