package com.nascimento.padroes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nascimento.padroes.model.Endereco;
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{

}
