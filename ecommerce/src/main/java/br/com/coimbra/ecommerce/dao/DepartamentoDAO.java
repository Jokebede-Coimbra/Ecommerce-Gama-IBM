package br.com.coimbra.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.coimbra.ecommerce.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {

	
}
