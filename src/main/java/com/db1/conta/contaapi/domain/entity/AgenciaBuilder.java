package com.db1.conta.contaapi.domain.entity;

import javax.validation.Validation;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public interface AgenciaBuilder {

	@NotNull
	String getNumero();
	
	@NotBlank
	String getDigito();
	
	@NotNull
	Cidade getCidade();
	
	default Agencia build() {
		Validation.buildDefaultValidatorFactory().getValidator().validate(this);
		return new Agencia(this);
	}
}
