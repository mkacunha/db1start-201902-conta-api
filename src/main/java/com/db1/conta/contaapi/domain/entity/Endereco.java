package com.db1.conta.contaapi.domain.entity;

import org.springframework.util.Assert;

public class Endereco {
	
	private Long id;
	
	private Cliente cliente;
	
	private Cidade cidade;
	
	private String logradouro;
	
	private String numero;
	
	private String cep;
	
	private String complemento;

	public Endereco(Cliente cliente, Cidade cidade, String logradouro, String numero, String cep, String complemento) {
		Assert.notNull(cliente, "Cliente é obrigatório");
		Assert.notNull(cidade, "Cidade é obrigatório");
		Assert.hasText(logradouro, "Logradouro é obrigatório");
		Assert.hasText(numero, "Número é obrigatório");
		Assert.hasText(cep, "CEP é obrigatório");
		Assert.isTrue(cep.length() == 8, "CEP Inválido");
		this.cliente = cliente;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
	}
	
	

}
