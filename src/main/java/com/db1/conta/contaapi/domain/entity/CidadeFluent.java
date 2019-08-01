package com.db1.conta.contaapi.domain.entity;

public interface CidadeFluent {
	
	CidadeEstado nome(String nome);

	interface CidadeEstado {
		
		Cidade estado(Estado estado);
	}
}
