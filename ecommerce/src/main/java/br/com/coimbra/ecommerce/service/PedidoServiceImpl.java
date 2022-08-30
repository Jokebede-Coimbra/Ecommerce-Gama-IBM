package br.com.coimbra.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.coimbra.ecommerce.dao.PedidoDAO;
import br.com.coimbra.ecommerce.dto.FaturamentoMensal;
import br.com.coimbra.ecommerce.model.ItemPedido;
import br.com.coimbra.ecommerce.model.Pedido;

@Service
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private PedidoDAO dao;

	@Override
	public Pedido inserirNovoPedido(Pedido novo) {
		for (ItemPedido item : novo.getItens()) {
			item.setPedido(novo);
		}
		return dao.save(novo);
	}

	@Override
	public Pedido recuperarPeloNumero(Integer numero) {

		return dao.findById(numero).orElse(null);
	}

	@Override
	public ArrayList<FaturamentoMensal> recuperarFaturamento(Integer ano) {

		return dao.recuperarFaturamentoPorAno(ano);
	}

}
