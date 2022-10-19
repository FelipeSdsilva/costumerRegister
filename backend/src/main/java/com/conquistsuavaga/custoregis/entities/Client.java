package com.conquistsuavaga.custoregis.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String lastName;
	private String email;
	private char gender;
	private String cpf;
	private Date birthday;
	private Integer numberHouse;
	private String complement;

	@ManyToMany
	@JoinTable(name = "tb_address_client", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "address_id"))
	private Set<Address> adresses = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "tb_phone_client", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "phone_id"))
	private Set<Phone> phones = new HashSet<>();

	public Client() {
	}

	public Client(Long id, String name, String lastName, String email, char gender, String cpf, Date birthday,
			Integer numberHouse, String complement) {
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

	public Set<Address> getAdresses() {
		return adresses;
	}

	public Set<Phone> getPhones() {
		return phones;
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
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}
}
