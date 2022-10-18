package com.conquistsuavaga.custoregis.dto;

import java.io.Serializable;

import com.conquistsuavaga.custoregis.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String lastName;
	private char gender;
	private String cpf;

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String lastName, char gender, String cpf) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.cpf = cpf;
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		lastName = entity.getLastName();
		gender = entity.getGender();
		cpf = entity.getCpf();
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
}
