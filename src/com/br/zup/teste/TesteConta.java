package com.br.zup.teste;

import com.br.zup.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta("1997", "Santander", "6542.5448", 1000);
		
		conta.depositar(800);
		conta.sacar(250);
		conta.transferir(200,conta);
		conta.saldoConta(0);
		System.out.println(conta);
		
	}

}
