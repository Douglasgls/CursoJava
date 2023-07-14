package principal;

import java.util.Scanner;

import entidade.ContaBancaria;

public class Program {
 public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Numero da conta: ");
	int numeroConta = sc.nextInt();
	System.out.println("Nome do dono da conta: ");
	String nome = sc.next();
	System.out.println("deseja depositar valor na sua conta: (y/n) ");
	String letra = sc.next();
	ContaBancaria novaConta;
	if (letra.equals("y")) {
		System.out.print("digite o valor a ser depositado inicialmente: ");
		double saldo = sc.nextDouble();
		 novaConta = new ContaBancaria(numeroConta, nome, saldo);
	}
	else {
		 novaConta = new ContaBancaria(numeroConta, nome);
	}
	
	System.out.println("account data \n"+novaConta.toString());
	
	System.out.print("entre com um deposito: ");
	double deposito = sc.nextDouble();
	novaConta.SaldoDeposito(deposito);
	
	System.out.println("update account data \n"+novaConta.toString());
	
	System.out.print("retire um saque: ");
	double saque = sc.nextDouble();
	novaConta.SaldoSaque(saque);
	
	System.out.println("update account data \n"+novaConta.toString());
	
	sc.close();
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
 
 
}
