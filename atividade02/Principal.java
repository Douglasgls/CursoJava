package atividade02;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Conta> contas = new ArrayList<>();
		Banco banco = null;
		Cliente cliente = null;
		Conta conta = null;

		while (true) {


		System.out.println("1. Cadastrar Conta\r\n"
		+ "2. Realizar depósito (Buscar pelo CPF do cliente)\r\n"
		+ "3. Realizar saque (Buscar pelo CPF do cliente)\r\n"
		+ "4. Verificar saldo (Buscar pelo CPF do cliente)\r\n"
		+ "5. Consultar número e nome da agência (Mostrar nome e o CPF do cliente)\r\n"
		+ "6. Alterar o número e nome da agência (Buscar pelo nome do cliente)\r\n"
		+ "0. Sair");


		int ch = sc.nextInt();

		if (ch == 1) {
		System.out.print("Digite o valor para 'numero agencia': ");
		       int numeroAgencia = Integer.parseInt(sc.next());

		       System.out.print("Digite o valor para 'nome agencia': ");
		       String nomeAgencia =  sc.next();

		           
		       banco = new Banco(numeroAgencia,nomeAgencia);
		       
		       
		       
		       
		       System.out.print("Digite o valor para 'cliente nome': ");
		       String nomecliente = sc.next();

		       System.out.print("Digite o valor para 'CPF cliente: ': ");
		       String cpfcliente =  sc.next();
		       
		       cliente = new Cliente(nomecliente, cpfcliente);
		   
		       
		   
		       System.out.println("digite o valor para o numero conta: ");
		       int numeroconta = sc.nextInt();
		       System.out.println("digite o valor para o saldo");
		       double saldo = sc.nextDouble();
		       
		     
		       conta = new Conta(numeroconta, banco, cliente, saldo);
		       contas.add(conta);
		 
		}
		if (ch == 2 ) {
		System.out.println("cpf: ");
		String cpf = sc.next();
		System.out.println("valor: ");
		double deposito =sc.nextDouble();
		conta.deposito(cpf, deposito, contas);

		}if(ch == 3) {
		System.out.println("cpf: ");
		String cpf = sc.next();
		System.out.println("valor: ");
		double deposito =sc.nextDouble();
		conta.saque(cpf, deposito, contas);

		} if (ch ==4) {
		System.out.println("cpf: ");
		String cpf = sc.next();
		conta.verificasaldo(cpf, contas);
		} if(ch == 5) {
		System.out.print("Digite o valor para cliente nome: ");
		    String nomecliente = sc.next();

		    System.out.print("Digite o valor para 'CPF cliente: ': ");
		    String cpfcliente =  sc.next();
		   
		   
		    conta.consultarAgencia(cpfcliente, nomecliente, contas);
		}if(ch ==6) {
		System.out.print("Digite o valor para cliente nome: ");
		    String nomecliente = sc.next();

		    System.out.print("Digite o valor para 'CPF cliente: ': ");
		    String cpfcliente =  sc.next();
		   
		    conta.alterarAgencia(cpfcliente, nomecliente, contas);
		} if(ch == 0) {
		break;
		}





		}



		}

}
