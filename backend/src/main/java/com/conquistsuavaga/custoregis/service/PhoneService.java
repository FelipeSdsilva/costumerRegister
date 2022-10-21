package com.conquistsuavaga.custoregis.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conquistsuavaga.custoregis.dto.PhoneDTO;
import com.conquistsuavaga.custoregis.entities.Phone;
import com.conquistsuavaga.custoregis.repositories.PhoneRepository;
import com.conquistsuavaga.custoregis.service.exceptions.ResourceNotFoundException;

@Service
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;

	@Transactional(readOnly = true)
	public List<PhoneDTO> findAll() {
		List<Phone> phoneList = phoneRepository.findAll();
		return phoneList.stream().map(x -> new PhoneDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public PhoneDTO findById(Long id) {
		Optional<Phone> obj = phoneRepository.findById(id);
		Phone phone = obj.orElseThrow(() -> new ResourceNotFoundException("Id not found"));
		return new PhoneDTO(phone);
	}

	public PhoneDTO insert(PhoneDTO phoneDTO) {
		
		Phone entity = new Phone();
		entity.setNumber(phoneDTO.getNumber());
		entity.setType(phoneDTO.getType());
		entity = phoneRepository.save(entity);
		
		return new PhoneDTO(entity);
	}

	

}
