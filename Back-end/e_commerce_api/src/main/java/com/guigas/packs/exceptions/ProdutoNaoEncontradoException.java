package com.guigas.packs.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProdutoNaoEncontradoException extends RuntimeException {

	public ProdutoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	private static final long serialVersionUID = 1L;
}
