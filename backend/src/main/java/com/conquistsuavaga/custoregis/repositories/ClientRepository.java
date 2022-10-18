package com.conquistsuavaga.custoregis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conquistsuavaga.custoregis.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
