package br.com.coimbra.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.coimbra.ecommerce.dao.ProdutoDAO;
import br.com.coimbra.ecommerce.model.Produto;

@Service
public class ProdutoServiceImpl implements IProdutoService{

	@Autowired
	private ProdutoDAO dao;
	
	@Override
	public ArrayList<Produto> recuperarTodos() {
		// TODO Auto-generated method stub
		// return (ArrayList<Produto>)dao.findAll();
		// return dao.findByOrderByPreco();
		return dao.findByNomeContaining("Console");
	}

	@Override
	public Produto recuperarPeloCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return dao.findById(codigo).orElse(null);
	}

	@Override
	public Produto cadastrarNovo(Produto novo) {
		// TODO Auto-generated method stub
		return dao.save(novo);
	}

	@Override
	public ArrayList<Produto> buscarPorPalavra(String palavra) {
		// TODO Auto-generated method stub
		return dao.findByNomeContaining(palavra);
	}

}
