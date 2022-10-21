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

import com.conquistsuavaga.custoregis.dto.AddressDTO;
import com.conquistsuavaga.custoregis.service.AddressService;

@RestController
@RequestMapping(value = "/adresses")
public class AddressResource {

	@Autowired
	private AddressService addressService;

	@GetMapping
	public ResponseEntity<List<AddressDTO>> findAllAdresses() {
		List<AddressDTO> addressList = addressService.findAll();
		return ResponseEntity.ok().body(addressList);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<AddressDTO> findAddressById(@PathVariable Long id) {
		AddressDTO address = addressService.findById(id);
		return ResponseEntity.ok().body(address);
	}
	
	@PostMapping
	public ResponseEntity<AddressDTO> insertNewAddress(@RequestBody AddressDTO addressDTO){
		addressDTO = addressService.insert(addressDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(addressDTO).toUri();
		return  ResponseEntity.created(uri).body(addressDTO);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<AddressDTO> updateClient(@PathVariable Long id, @RequestBody AddressDTO addressDTO){
		addressDTO = addressService.update(id,addressDTO);
		return ResponseEntity.ok().body(addressDTO);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteAddress(@PathVariable Long id){
		addressService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
