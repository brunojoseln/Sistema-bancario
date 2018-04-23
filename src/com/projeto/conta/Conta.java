package com.projeto.conta;

public class Conta {
	private int numeroConta;
	protected String numero;
	
	//Visibilidade do saldo alterada para que n�o possa ser alterado pelo programa principal,so pode ser alterda dentro da classe Conta
	private double saldo = 100;
	
	//M�todo utilizado para depositar
	public void depositar(double valorDepositar){
		this.saldo = this.saldo + valorDepositar ;
	}
	
	//M�todo utilizado para o usu�rio sacar
	public void sacar(double valorSacar){
		this.saldo = this.saldo - valorSacar;
	}
	
	public double retornarSaldo(){
		return this.saldo;
	}

}
