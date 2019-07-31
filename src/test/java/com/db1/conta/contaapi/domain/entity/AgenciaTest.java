package com.db1.conta.contaapi.domain.entity;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AgenciaTest {

	@Test
	public void deveCriarUmaAgencia() {
		Cidade cidade = Mockito.mock(Cidade.class);
		Agencia agencia = new Agencia("123456", "1", cidade);
		Assert.assertEquals("123456", agencia.getNumero());
		Assert.assertEquals("1", agencia.getDigito());
		Assert.assertEquals(cidade, agencia.getCidade());
	}
}
