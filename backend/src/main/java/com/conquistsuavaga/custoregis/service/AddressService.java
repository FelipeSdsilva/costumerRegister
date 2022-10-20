package com.conquistsuavaga.custoregis.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conquistsuavaga.custoregis.dto.AddressDTO;
import com.conquistsuavaga.custoregis.entities.Address;
import com.conquistsuavaga.custoregis.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional(readOnly = true)
	public List<AddressDTO> findAll() {
		List<Address> addressList = addressRepository.findAll();
		return addressList.stream().map(x -> new AddressDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public AddressDTO findById(Long id) {
		Optional<Address> obj = addressRepository.findById(id);
		Address address = obj.get();
		return new AddressDTO(address);
	}
}
