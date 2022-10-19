package com.conquistsuavaga.custoregis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conquistsuavaga.custoregis.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
