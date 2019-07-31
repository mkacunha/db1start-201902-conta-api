package com.db1.conta.contaapi.domain.entity;

import org.springframework.util.Assert;

public class Historico {

	private Long id;
	
	private Conta conta;
	
	private HistoricoTipo tipo;
	
	private Double valor;
	
	private Double saldoAtual;

	public Historico(Conta conta, HistoricoTipo tipo, Double valor, Double saldoAtual) {
		Assert.notNull(conta, "Conta é obrigatório");
		Assert.notNull(tipo, "Tipo histórico é obrigatório");
		Assert.notNull(valor, "Valor é obrigatório");
		Assert.notNull(saldoAtual, "Saldo atual é obrigatório");		
		this.conta = conta;
		this.tipo = tipo;
		this.valor = valor;
		this.saldoAtual = saldoAtual;
	}

	public Long getId() {
		return id;
	}

	public Conta getConta() {
		return conta;
	}

	public HistoricoTipo getTipo() {
		return tipo;
	}

	public Double getValor() {
		return valor;
	}

	public Double getSaldoAtual() {
		return saldoAtual;
	}
}
