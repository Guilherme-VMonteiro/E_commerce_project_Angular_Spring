package com.guigas.packs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guigas.packs.dto.ProdutoDTO;
import com.guigas.packs.entity.Produto;
import com.guigas.packs.exceptions.ProdutoNaoEncontradoException;
import com.guigas.packs.mapper.ProdutoMapper;
import com.guigas.packs.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository repository;
	
	@Autowired
	ProdutoMapper produtoMapper;
	
	public ProdutoDTO findById(Long id) {
		return produtoMapper.toDTO(repository.findById(id).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + id)));
	}
	
	public List<ProdutoDTO> findAll(){
		return produtoMapper.toDTOList(repository.findAll());
	}
	
	public ProdutoDTO create(ProdutoDTO produtoDTO) {
		
//		if(produtoDTO == null) throw new RequiredObjectIsNullException();
		
		return produtoMapper.toDTO(repository.save(produtoMapper.toEntity(produtoDTO)));
	}
	
	public ProdutoDTO update(ProdutoDTO produtoDTO) {
		
//		if(produtoDTO == null) throw new RequiredObjectIsNullException();
		
		Produto novoProduto = repository.findById(produtoDTO.getId()).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + produtoDTO.getId()));
		
		novoProduto.setNome(produtoDTO.getNome());
		novoProduto.setDescricao(produtoDTO.getDescricao());
		novoProduto.setUrlImagem(produtoDTO.getUrlImagem());
		novoProduto.setQuantidadeDisponivel(produtoDTO.getQuantidadeDisponivel());
		novoProduto.setPreco(produtoDTO.getPreco());
		
		return produtoMapper.toDTO(repository.save(novoProduto));
	}
	
	public void delete(Long id) {
		Produto produto = repository.findById(id).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + id));
		repository.delete(produto);
	}
}
