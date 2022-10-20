package com.conquistsuavaga.custoregis.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
