package com.projeto.conta;
import javax.swing.JOptionPane;

public class ClassePrincipal {

	public static void main(String[] args) {
		int op;
		Conta conta = new Conta();
		
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao Sistema bancário \n 1-Depositar \n 2-Sacar \n 3 -Consultar \n 0-Sair"));
			
			switch (op) {
			case 1:
				conta.depositar(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que ira depositar")));
				break;

			case 2:
				conta.sacar(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor que ira sacar")));
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null,(conta.retornarSaldo()));
				break;
			
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado :)");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Valor inválido");
				break;
			}
		} while (op!=0);
		
		
		/*
		O saldo da conta não pode ser alterado pois o salto tem a visibilidade protected
		conta.saldo= 0;
		*/
	}

}
