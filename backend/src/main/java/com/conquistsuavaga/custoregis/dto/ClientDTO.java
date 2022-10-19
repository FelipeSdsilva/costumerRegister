package com.conquistsuavaga.custoregis.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.conquistsuavaga.custoregis.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String lastName;
	private String email;
	private char gender;
	private String cpf;
	private Date birthday;
	private Integer numberHouse;
	private String complement;

	private Set<AddressDTO> adresses = new HashSet<>();

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String lastName, String email, char gender, String cpf, Date birthday,
			Integer numberHouse, String complement) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.cpf = cpf;
		this.birthday = birthday;
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
		birthday = entity.getBirthday();
		numberHouse = entity.getNumberHouse();
		complement = entity.getComplement();
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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

	public Set<AddressDTO> getAdresses() {
		return adresses;
	}
}
