package com.conquistsuavaga.custoregis.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.conquistsuavaga.custoregis.dto.ClientDTO;
import com.conquistsuavaga.custoregis.service.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	private ClientService clientService;

	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAllClient() {
		List<ClientDTO> clientList = clientService.findAll();
		return ResponseEntity.ok().body(clientList);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ClientDTO> findClientById(@PathVariable Long id) {
		ClientDTO client = clientService.findById(id);
		return ResponseEntity.ok().body(client);
	}
	
	@PostMapping
	public ResponseEntity<ClientDTO> insertNewClient(@RequestBody ClientDTO clientDTO){
		clientDTO = clientService.insert(clientDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(clientDTO).toUri();
		return  ResponseEntity.created(uri).body(clientDTO);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ClientDTO> updateClient(@PathVariable Long id, @RequestBody ClientDTO clientDTO){
		clientDTO = clientService.update(id,clientDTO);
		return ResponseEntity.ok().body(clientDTO);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteClient(@PathVariable Long id){
		clientService.delete(id);
		return ResponseEntity.noContent().build();
	}
}