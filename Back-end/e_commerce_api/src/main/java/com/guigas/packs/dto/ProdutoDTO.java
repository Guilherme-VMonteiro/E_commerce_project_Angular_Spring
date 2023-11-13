package com.guigas.packs.dto;

import org.mapstruct.Mapping;
import org.springframework.hateoas.RepresentationModel;

import java.util.Objects;

public class ProdutoDTO extends RepresentationModel<ProdutoDTO> {

    private Long id_entity;
    private String nome;
    private String descricao;
    private String urlImagem;
    private Integer quantidadeDisponivel;
    private Long preco;

    public ProdutoDTO() {
    }

    public Long getId_entity() {
        return id_entity;
    }

    public void setId_entity(Long id_entity) {
        this.id_entity = id_entity;
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        ProdutoDTO that = (ProdutoDTO) object;
        return Objects.equals(id_entity, that.id_entity) && Objects.equals(nome, that.nome) && Objects.equals(descricao, that.descricao) && Objects.equals(urlImagem, that.urlImagem) && Objects.equals(quantidadeDisponivel, that.quantidadeDisponivel) && Objects.equals(preco, that.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id_entity, nome, descricao, urlImagem, quantidadeDisponivel, preco);
    }
}
