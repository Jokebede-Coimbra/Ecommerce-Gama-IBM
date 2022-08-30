package br.com.coimbra.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.coimbra.ecommerce.dto.FaturamentoMensal;
import br.com.coimbra.ecommerce.model.Pedido;
import br.com.coimbra.ecommerce.service.IPedidoService;

@RestController
public class PedidoController {

	@Autowired
	private IPedidoService service;

	@GetMapping("/pedidos/{numeros}")
	public ResponseEntity<Pedido> recuperarPeloNumero(@PathVariable Integer numero) {
		Pedido res = service.recuperarPeloNumero(numero);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping("/pedidos")
	public ResponseEntity<Pedido> inserirNovoPedido(@RequestBody Pedido novo) {
		Pedido res = service.inserirNovoPedido(novo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().body(res);
	}

	@GetMapping("faturamento/{ano}")
	public ArrayList<FaturamentoMensal> recuperarFaturamento(@PathVariable Integer ano) {
		return service.recuperarFaturamento(ano);
	}
}
