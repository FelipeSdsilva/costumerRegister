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

@Entity
@Table(name = "tb_address")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String street;
	private String district;
	private String city;
	private String state;
	private String cep;

	@ManyToMany(mappedBy = "adresses")
	private Set<Client> clients = new HashSet<>();

	public Address() {
	}

	public Address(Long id, String street, String district, String city, String state, String cep) {
		this.id = id;
		this.street = street;
		this.district = district;
		this.city = city;
		this.state = state;
		this.cep = cep;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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
		Address other = (Address) obj;
		return Objects.equals(id, other.id);
	}
}
