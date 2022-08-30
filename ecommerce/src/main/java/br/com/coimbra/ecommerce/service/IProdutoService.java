package br.com.coimbra.ecommerce.service;

import java.util.ArrayList;

import br.com.coimbra.ecommerce.model.Produto;

public interface IProdutoService {

	public ArrayList<Produto> recuperarTodos();
	public ArrayList<Produto> buscarPorPalavra(String palavra);
	public Produto recuperarPeloCodigo(Integer codigo);
	public Produto cadastrarNovo(Produto novo);
}
