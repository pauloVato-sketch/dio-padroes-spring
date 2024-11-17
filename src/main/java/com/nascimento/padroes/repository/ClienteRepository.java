package com.nascimento.padroes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nascimento.padroes.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
