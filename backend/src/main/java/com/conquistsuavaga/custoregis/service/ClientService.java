package com.conquistsuavaga.custoregis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.conquistsuavaga.custoregis.dto.ClientDTO;
import com.conquistsuavaga.custoregis.entities.Client;

@Service
public class ClientService {

	public List<ClientDTO> findAll() {
		List <Client> clientList = new ArrayList<>();
		return clientList.stream().map(x -> new ClientDTO()).collect(Collectors.toList());
	}

}
