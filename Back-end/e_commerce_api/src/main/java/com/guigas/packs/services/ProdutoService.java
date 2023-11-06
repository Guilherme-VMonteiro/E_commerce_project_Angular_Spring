package com.guigas.packs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigas.packs.entity.Produto;
import com.guigas.packs.exceptions.ProdutoNaoEncontradoException;
import com.guigas.packs.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository repository;
	
	public Produto findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + id));
	}
	
	public List<Produto> findAll(){
		return repository.findAll();
	}
	
	public Produto create(Produto produto) {
		return repository.save(produto);
	}
	
	public Produto update(Produto produto) {
		Produto novoProduto = repository.findById(produto.getId()).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + produto.getId()));
		
		novoProduto.setNome(produto.getNome());
		novoProduto.setDescricao(produto.getDescricao());
		novoProduto.setUrlImagem(produto.getUrlImagem());
		novoProduto.setQuantidadeDisponivel(produto.getQuantidadeDisponivel());
		novoProduto.setPreco(produto.getPreco());
		
		return repository.save(novoProduto);
	}
	
	public void delete(Long id) {
		Produto produto = repository.findById(id).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + id));
		repository.delete(produto);
	}
}
