package com.br.zup.modelo;

import com.br.zup.interfaces.ContaInterfaces;

public class Conta implements ContaInterfaces {
	
	private String numeroConta;
	private String banco;
	private String agencia;
	private double saldo;
	
	public Conta(String numeroConta, String banco, String agencia, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "\n - Número conta : "+ this.getNumeroConta()+ "\n";
		modelo += " -Banco : "+ this.getBanco()+ "\n";
		modelo += " -Agência : "+ this.getAgencia()+ "\n";
		modelo += " -Saldo : "+ this.getSaldo()+ "\n";
		
		return modelo;
		
	}
	
	@Override
	public void depositar(double deposito) {
		double totalValor = this.getSaldo() + deposito;
		this.setSaldo(totalValor);
	}
	
	@Override
	public void saldoConta(double saldo) {
		System.out.println("Seu saldo atual é de : "+ this.getSaldo());
	}
	
	@Override
	public void transferir(double valor, Conta contaEntrada) {
		if (this.getSaldo() > valor) {
			double transferencia = this.getSaldo() - valor;
			this.setSaldo(transferencia);
		}else {
			System.out.println("Você não possui saldo suficiente para essa operação.");
		}
	}
	
	@Override
	public void sacar(double saque) {
		if (this.getSaldo() >= saque) {
			double totalValor = this.getSaldo() - saque;
			this.setSaldo(totalValor);
		}else {
			System.out.println("Você não possui saldo suficiente para esse saque.");
		}
	}

}
