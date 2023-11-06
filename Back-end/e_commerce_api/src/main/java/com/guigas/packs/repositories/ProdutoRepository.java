package com.guigas.packs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guigas.packs.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
