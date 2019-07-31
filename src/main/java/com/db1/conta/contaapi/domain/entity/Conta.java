package com.db1.conta.contaapi.domain.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

public class Conta {
	
	private Long id;
	
	private String numero;
	
	private Agencia agencia;
	
	private Cliente cliente;
	
	private Double saldo;
	
	private List<Historico> historicos = new ArrayList<Historico>();

	public Conta(String numero, Agencia agencia, Cliente cliente) {
		Assert.hasText(numero, "Número da conta é obrigatório");
		Assert.notNull(agencia, "Agência é obrigatório");
		Assert.notNull(cliente, "Cliente é obrigatório");
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = 0.0;
	}

	public Long getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Double getSaldo() {
		return saldo;
	}	
}
