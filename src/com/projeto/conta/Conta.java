package com.projeto.conta;

public class Conta {
	private int numeroConta;
	protected String numero;
	
	//Visibilidade do saldo alterada para que não possa ser alterado pelo programa principal,so pode ser alterda dentro da classe Conta
	private double saldo = 100;
	
	//Método utilizado para depositar
	public void depositar(double valorDepositar){
		this.saldo = this.saldo + valorDepositar ;
	}
	
	//Método utilizado para o usuário sacar
	public void sacar(double valorSacar){
		this.saldo = this.saldo - valorSacar;
	}
	
	public double retornarSaldo(){
		return this.saldo;
	}

}
