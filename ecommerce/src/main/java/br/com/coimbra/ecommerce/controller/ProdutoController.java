package br.com.coimbra.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.coimbra.ecommerce.model.Produto;
import br.com.coimbra.ecommerce.service.IProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private IProdutoService service;

	// recuperar todo mundo
	@GetMapping("/produtos")
	public ArrayList<Produto> recuperarTodoMundo() {
		return service.recuperarTodos();
	}

	// recuperar pelo ID
	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> recuperaPeloCodigo(@PathVariable Integer codigo) {
		Produto res = service.recuperarPeloCodigo(codigo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.notFound().build();
	}

	// cadastrar
	@PostMapping("/produtos")
	public ResponseEntity<Produto> inserirNovoProduto(@RequestBody Produto novo) {
		Produto res = service.cadastrarNovo(novo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().build();
	}

	// Recuperar por palavra chave
	@GetMapping("/produtos/busca")
	public ArrayList<Produto> recuperarPorPalavra(@RequestParam(name="palavra") String palavra) {
		return service.buscarPorPalavra(palavra);
	}
}
