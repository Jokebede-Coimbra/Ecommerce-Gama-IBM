package br.com.coimbra.ecommerce.service;

import java.util.ArrayList;

import br.com.coimbra.ecommerce.dto.FaturamentoMensal;
import br.com.coimbra.ecommerce.model.Pedido;

public interface IPedidoService {

	public Pedido inserirNovoPedido(Pedido novo);
	public Pedido recuperarPeloNumero(Integer numero);
	public ArrayList<FaturamentoMensal> recuperarFaturamento(Integer ano);
}
