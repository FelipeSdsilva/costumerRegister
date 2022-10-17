package com.conquistsuavaga.custoregis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conquistsuavaga.custoregis.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
