package com.guigas.packs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guigas.packs.dto.ProdutoDTO;
import com.guigas.packs.services.ProdutoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ProdutoService service;
	
	@GetMapping("/{id}")
	public ProdutoDTO findById(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<ProdutoDTO> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public ProdutoDTO create(@RequestBody ProdutoDTO produtoDTO) {
		return service.create(produtoDTO);
	}
	
	@PutMapping
	public ProdutoDTO update(@RequestBody ProdutoDTO produtoDTO) {
		return service.update(produtoDTO);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
	}
}
