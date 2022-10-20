package com.conquistsuavaga.custoregis.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conquistsuavaga.custoregis.dto.PhoneDTO;
import com.conquistsuavaga.custoregis.service.PhoneService;

@RestController
@RequestMapping(value = "/phones")
public class PhoneResource {

	@Autowired
	private PhoneService phoneService;

	@GetMapping
	public ResponseEntity<List<PhoneDTO>> findAllPhones() {
		List<PhoneDTO> phoneList = phoneService.findAll();
		return ResponseEntity.ok().body(phoneList);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<PhoneDTO> findPhoneById(@PathVariable Long id) {
		PhoneDTO phone = phoneService.findById(id);
		return ResponseEntity.ok().body(phone);
	}
}
