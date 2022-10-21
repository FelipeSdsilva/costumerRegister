package com.conquistsuavaga.custoregis.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conquistsuavaga.custoregis.dto.AddressDTO;
import com.conquistsuavaga.custoregis.dto.ClientDTO;
import com.conquistsuavaga.custoregis.dto.PhoneDTO;
import com.conquistsuavaga.custoregis.entities.Address;
import com.conquistsuavaga.custoregis.entities.Client;
import com.conquistsuavaga.custoregis.entities.Phone;
import com.conquistsuavaga.custoregis.repositories.AddressRepository;
import com.conquistsuavaga.custoregis.repositories.ClientRepository;
import com.conquistsuavaga.custoregis.repositories.PhoneRepository;
import com.conquistsuavaga.custoregis.service.exceptions.DatabaseException;
import com.conquistsuavaga.custoregis.service.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private PhoneRepository phoneRepository;

	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> clientList = clientRepository.findAll();
		return clientList.stream().map(client -> new ClientDTO(client)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = clientRepository.findById(id);
		Client client = obj.orElseThrow(() -> new ResourceNotFoundException("Id not found"));
		return new ClientDTO(client);
	}

	@Transactional
	public ClientDTO insert(ClientDTO clientDTO) {
		Client entity = new Client();
		converterDtoInEntity(clientDTO, entity);
		entity = clientRepository.save(entity);
		return new ClientDTO(entity);
	}

	@Transactional
	public ClientDTO update(Long id, ClientDTO clientDTO) {
		try {
			Client entity = clientRepository.getReferenceById(id);
			converterDtoInEntity(clientDTO, entity);
			entity = clientRepository.save(entity);
			return new ClientDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}
	}

	public void delete(Long id) {
		try {
			clientRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found " + id );
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violantion ");
		}
	}

	private void converterDtoInEntity(ClientDTO clientDTO, Client entity) {

		entity.setName(clientDTO.getName());
		entity.setLastName(clientDTO.getLastName());
		entity.setEmail(clientDTO.getEmail());
		entity.setGender(clientDTO.getGender());
		entity.setCpf(clientDTO.getCpf());
		entity.setBirthDate(clientDTO.getBirthDate());
		entity.setNumberHouse(clientDTO.getNumberHouse());
		entity.setComplement(clientDTO.getComplement());

		entity.getAdresses().clear();

		for (AddressDTO addDto : clientDTO.getAdresses()) {

			Address address = addressRepository.getReferenceById(addDto.getId());
			entity.getAdresses().add(address);
		}

		entity.getPhones().clear();

		for (PhoneDTO phoDto : clientDTO.getPhones()) {

			Phone phone = phoneRepository.getReferenceById(phoDto.getId());
			entity.getPhones().add(phone);
		}

	}

}
