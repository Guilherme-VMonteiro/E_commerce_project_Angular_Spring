package com.guigas.packs.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.guigas.packs.dto.ProdutoDTO;
import com.guigas.packs.entity.Produto;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

	ProdutoDTO toDTO(Produto produto);

	Produto toEntity(ProdutoDTO produtoDTO);

	List<ProdutoDTO> toDTOList(List<Produto> protudosList);
}
