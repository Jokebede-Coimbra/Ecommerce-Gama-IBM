package br.com.coimbra.ecommerce.service;

import java.util.ArrayList;

import br.com.coimbra.ecommerce.model.Departamento;

public interface IDepartamentoService {

	public Departamento criarNovo(Departamento novo);

	public Departamento atualizarDados(Departamento dados);

	public ArrayList<Departamento> buscarTodos();

	public Departamento buscarPeloId(Integer id);

	public void excluirDepartamento(Integer id);

}
