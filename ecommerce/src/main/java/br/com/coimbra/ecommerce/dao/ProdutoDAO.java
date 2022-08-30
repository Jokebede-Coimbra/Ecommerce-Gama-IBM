package br.com.coimbra.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.coimbra.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{

	// 	Quero retornar uma lista de produtos
	public ArrayList<Produto> findByOrderByPreco();
	public ArrayList<Produto> findByOrderByPrecoDesc();
	public ArrayList<Produto> findByNomeContaining(String palavraChave);
}
