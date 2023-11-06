package com.guigas.packs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	private String descricao;
	private String urlImagem;

	@Column(nullable = false)
	private Integer quantidadeDisponivel;

	@Column(nullable = false)
	private Long preco;

	public Produto() {
	}

	public Produto(String nome, String descricao, String urlImagem, Integer quantidadeDisponivel, Long preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.urlImagem = urlImagem;
		this.quantidadeDisponivel = quantidadeDisponivel;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public Long getPreco() {
		return preco;
	}

	public void setPreco(Long preco) {
		this.preco = preco;
	}

}
