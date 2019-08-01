package com.db1.conta.contaapi.domain.entity;

public class CidadeFluentBuilder implements CidadeFluent, CidadeFluent.CidadeEstado {
	
	private String nome;
	
	@Override
	public CidadeEstado nome(String nome) {
		this.nome = nome;
		return this;
	}
	
	@Override
	public Cidade estado(Estado estado) {
		return new Cidade(nome, estado);
	}

	

}
