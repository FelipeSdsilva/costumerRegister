package com.conquistsuavaga.custoregis.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conquistsuavaga.custoregis.dto.AddressDTO;
import com.conquistsuavaga.custoregis.entities.Address;
import com.conquistsuavaga.custoregis.repositories.AddressRepository;
import com.conquistsuavaga.custoregis.service.exceptions.ResourceNotFoundException;

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

	@Transactional
	public AddressDTO insert(AddressDTO addressDTO) {
		Address entity = new Address();
		converterDtoInEntity(addressDTO,entity);
		entity = addressRepository.save(entity);
		return new AddressDTO(entity);
	}

	@Transactional
	public AddressDTO update(Long id, AddressDTO addressDTO) {
		try {
			Address entity = addressRepository.getReferenceById(id);
			converterDtoInEntity(addressDTO, entity);
			entity = addressRepository.save(entity);
			return new AddressDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}
	}
	
	private void converterDtoInEntity(AddressDTO addressDTO, Address entity) {
		
		entity.setStreet(addressDTO.getStreet());
		entity.setDistrict(addressDTO.getDistrict());
		entity.setCity(addressDTO.getCity());
		entity.setState(addressDTO.getState());
		entity.setCep(addressDTO.getCep());
	
	}
}
