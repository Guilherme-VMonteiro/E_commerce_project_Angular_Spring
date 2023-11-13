package com.guigas.packs.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.guigas.packs.dto.ProdutoDTO;
import com.guigas.packs.entity.Produto;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
	@Mapping(source = "id",target = "id_entity")
	ProdutoDTO toDTO(Produto produto);

	@Mapping(source = "id_entity",target = "id")
	Produto toEntity(ProdutoDTO produtoDTO);

	List<ProdutoDTO> toDTOList(List<Produto> protudosList);
}
