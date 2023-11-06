package com.guigas.packs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigas.packs.entity.Produto;
import com.guigas.packs.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ProdutoService service;
	
	@GetMapping("/{id}")
	public Produto findById(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<Produto> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public Produto create(@RequestBody Produto produto) {
		return service.create(produto);
	}
	
	@PutMapping
	public Produto update(@RequestBody Produto produto) {
		return service.update(produto);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}
}
