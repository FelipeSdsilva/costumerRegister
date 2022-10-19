package com.conquistsuavaga.custoregis.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.conquistsuavaga.custoregis.entities.enums.PhoneType;

@Entity
@Table(name = "tb_phone")
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private PhoneType type;
	private String number;

	@ManyToMany(mappedBy = "phones")
	private Set<Client> clients = new HashSet<>();

	public Phone() {
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

	public Set<Client> getClients() {
		return clients;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(id, other.id);
	}
}
