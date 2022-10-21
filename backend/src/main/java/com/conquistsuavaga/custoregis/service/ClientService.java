package com.conquistsuavaga.custoregis.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.conquistsuavaga.custoregis.dto.ClientDTO;
import com.conquistsuavaga.custoregis.entities.Client;
import com.conquistsuavaga.custoregis.repositories.ClientRepository;
import com.conquistsuavaga.custoregis.service.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<ClientDTO> findAll() {
		List <Client> clientList = clientRepository.findAll();
		return clientList.stream().map(client -> new ClientDTO(client)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = clientRepository.findById(id);
		Client client= obj.orElseThrow(() -> new ResourceNotFoundException("Id not found"));
		return new ClientDTO(client);
	}

	public ClientDTO insert(ClientDTO clientDTO) {
		Client entity = new Client();
		converterDtoInEntity(clientDTO,entity);
		entity = clientRepository.save(entity);
		return new ClientDTO(entity);
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
		
		
	}
}
