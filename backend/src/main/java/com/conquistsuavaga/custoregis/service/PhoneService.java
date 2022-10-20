package com.conquistsuavaga.custoregis.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conquistsuavaga.custoregis.dto.PhoneDTO;
import com.conquistsuavaga.custoregis.entities.Phone;
import com.conquistsuavaga.custoregis.repositories.PhoneRepository;

@Service
public class PhoneService {

	@Autowired	
	private PhoneRepository phoneRepository;
	
	@Transactional(readOnly = true)
	public List<PhoneDTO> findAll() {
		List<Phone> phoneList = phoneRepository.findAll();
		return phoneList.stream().map(x -> new PhoneDTO(x)).collect(Collectors.toList());
	}

}
