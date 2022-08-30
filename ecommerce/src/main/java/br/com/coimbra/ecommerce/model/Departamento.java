package br.com.coimbra.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Significa qe a minha classe é armazenávelno banco
@Table(name = "departamento") // Torno explicito o nome da tabela
public class Departamento {

	@Column(name = "numero") // explicito o nome da coluna
	@Id // indico que este atributo corresponde a PK da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	private Integer numero;
	
	@Column(name="nome", length = 30, nullable = false)
	private String nome;
	
	@Column(name="descricao", nullable = true, columnDefinition = "TEXT")
	private String descricao;

	@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("departamento") 
	private List<Produto> listaProdutos;
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer codigo) {
		this.numero = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	

}
