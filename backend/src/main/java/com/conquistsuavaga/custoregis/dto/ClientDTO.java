package com.conquistsuavaga.custoregis.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.conquistsuavaga.custoregis.entities.Address;
import com.conquistsuavaga.custoregis.entities.Client;
import com.conquistsuavaga.custoregis.entities.Phone;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String lastName;
	private String email;
	private char gender;
	private String cpf;
	private Instant birthDate;
	private Integer numberHouse;
	private String complement;

	private List<AddressDTO> adresses = new ArrayList<>();

	private List<PhoneDTO> phones = new ArrayList<>();

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String lastName, String email, char gender, String cpf, Instant birthDate,
			Integer numberHouse, String complement) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.numberHouse = numberHouse;
		this.complement = complement;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		lastName = entity.getLastName();
		email = entity.getEmail();
		gender = entity.getGender();
		cpf = entity.getCpf();
		birthDate = entity.getBirthDate();
		numberHouse = entity.getNumberHouse();
		complement = entity.getComplement();
	}

	public ClientDTO(Client entity, Set<Address> adresses, Set<Phone> phones) {
		this(entity);
		adresses.forEach(address -> this.adresses.add(new AddressDTO(address)));
		phones.forEach(phone -> this.phones.add(new PhoneDTO(phone)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getNumberHouse() {
		return numberHouse;
	}

	public void setNumberHouse(Integer numberHouse) {
		this.numberHouse = numberHouse;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public List<AddressDTO> getAdresses() {
		return adresses;
	}

	public List<PhoneDTO> getPhones() {
		return phones;
	}
}
