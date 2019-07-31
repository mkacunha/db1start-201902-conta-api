package com.db1.conta.contaapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

public class Cliente {
	
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	private List<Conta> contas = new ArrayList<>();

	public Cliente(String nome, String cpf) {
		Assert.hasText(nome, "Nome é obrigatório");
		Assert.hasText(cpf, "CPF é obrigatório");
		Assert.isTrue(cpf.length() == 11, "CPF é inválido");
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}
}
