package com.db1.conta.contaapi.domain.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AgenciaBuilderImp implements AgenciaBuilder {

	private String numero;
	
	private String digito;
	
	private Cidade cidade;
	
	
	
	@Override
	public @NotNull String getNumero() {	
		return numero;
	}

	@Override
	public @NotBlank String getDigito() {
		return digito;
	}

	@Override
	public @NotNull Cidade getCidade() {
		return cidade;
	}	
}
