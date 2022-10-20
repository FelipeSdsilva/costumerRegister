package com.conquistsuavaga.custoregis.dto;

import java.io.Serializable;

import com.conquistsuavaga.custoregis.entities.Phone;
import com.conquistsuavaga.custoregis.entities.enums.PhoneType;

public class PhoneDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private PhoneType type;
	private String number;

	public PhoneDTO() {
	}

	public PhoneDTO(Long id, PhoneType type, String number) {
		this.id = id;
		this.type = type;
		this.number = number;
	}

	public PhoneDTO(Phone entity) {
		id = entity.getId();
		type = entity.getType();
		number = entity.getNumber();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PhoneType getType() {
		return type;
	}

	public void setType(PhoneType type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
