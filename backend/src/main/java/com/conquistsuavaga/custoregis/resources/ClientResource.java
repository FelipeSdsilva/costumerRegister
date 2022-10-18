package com.conquistsuavaga.custoregis.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conquistsuavaga.custoregis.dto.ClientDTO;
import com.conquistsuavaga.custoregis.service.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAllClient(){
		List<ClientDTO> clientList = clientService.findAll();
		return ResponseEntity.ok().body(clientList);
	}
	
}
