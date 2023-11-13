package com.guigas.packs.services;

import java.util.List;

import com.guigas.packs.controllers.ProdutoController;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

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
        ProdutoDTO produtoDTO = produtoMapper.toDTO(repository.findById(id).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + id)));

        //O código a seguir adiciona o link HATEOAS
        produtoDTO.add(linkTo(methodOn(ProdutoController.class).findById(id)).withSelfRel());

        return produtoDTO;
    }

    public List<ProdutoDTO> findAll() {

        List<ProdutoDTO> produtosDTO = produtoMapper.toDTOList(repository.findAll());

        produtosDTO
                .stream()
                .forEach(
                        produto -> produto.add(linkTo(methodOn(ProdutoController.class).findById(produto.getId_entity())).withSelfRel())
                );

        return produtosDTO;
    }

    public ProdutoDTO create(ProdutoDTO produtoDTO) {

//		if(produtoDTO == null) throw new RequiredObjectIsNullException();
        ProdutoDTO dto = produtoMapper.toDTO(repository.save(produtoMapper.toEntity(produtoDTO)));
        dto.add(linkTo(methodOn(ProdutoController.class).findById(dto.getId_entity())).withSelfRel());
        return dto;
    }

    public ProdutoDTO update(ProdutoDTO produtoDTO) {

//		if(produtoDTO == null) throw new RequiredObjectIsNullException();

        Produto novoProduto = repository.findById(produtoDTO.getId_entity()).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + produtoDTO.getId_entity()));

        novoProduto.setNome(produtoDTO.getNome());
        novoProduto.setDescricao(produtoDTO.getDescricao());
        novoProduto.setUrlImagem(produtoDTO.getUrlImagem());
        novoProduto.setQuantidadeDisponivel(produtoDTO.getQuantidadeDisponivel());
        novoProduto.setPreco(produtoDTO.getPreco());

        ProdutoDTO dto = produtoMapper.toDTO(repository.save(novoProduto));
        dto.add(linkTo(methodOn(ProdutoController.class).findById(dto.getId_entity())).withSelfRel());
        return dto;
    }

    public void delete(Long id) {
        Produto produto = repository.findById(id).orElseThrow(() -> new ProdutoNaoEncontradoException("Nenhum produto encontrado com o id: " + id));
        repository.delete(produto);
    }
}
