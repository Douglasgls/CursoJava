package atividade02;

import java.util.ArrayList;
import java.util.Scanner;

public class Conta {

	private int numero;
	private Banco banco;
	private Cliente cliente;
	private double saldo;

	public Conta(int numero, Banco banco, Cliente cliente, double saldo) {
		this.numero = numero;
		this.banco = banco;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(String cpf, double deposito, ArrayList<Conta> contas) {

		for (int i = 0; i < contas.size(); i++) {
			if (cpf.equals(contas.get(i).getCliente().getCPF())) {
				contas.get(i).saldo += deposito;
			}
		}
	}

	public void saque(String cpf, double deposito, ArrayList<Conta> contas) {

		for (int i = 0; i < contas.size(); i++) {
			if (cpf.equals(contas.get(i).getCliente().getCPF())) {
				contas.get(i).saldo -= deposito;
			}
		}
	}

	public void verificasaldo(String cpf, ArrayList<Conta> contas) {

		for (int i = 0; i < contas.size(); i++) {
			if (cpf.equals(contas.get(i).getCliente().getCPF())) {
				System.out.println("Saldo: "+contas.get(i).getSaldo());
				
			}
		}
	}

	public void consultarAgencia(String cpf, String nome, ArrayList<Conta> contas) {

		for (int i = 0; i < contas.size(); i++) {
			if (cpf.equals(contas.get(i).getCliente().getCPF())) {
				if (nome.equals(contas.get(i).getCliente().getNome())) {
					System.out.println("numero agencia: " + contas.get(i).getBanco().getNumeroAgencia());
					System.out.println("nome agencia: " + contas.get(i).getBanco().getNomeAgencia());

				}
			}
		}
	}

	public void alterarAgencia(String cpf, String nome, ArrayList<Conta> contas) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < contas.size(); i++) {
			if (cpf.equals(contas.get(i).getCliente().getCPF())) {
				if (nome.equals(contas.get(i).getCliente().getNome())) {
					System.out.println("numero agencia novo: ");
					int numeronovo = sc.nextInt();
					System.out.println("nome agencia novo: ");
					String nomenovo = sc.next();
					contas.get(i).getBanco().setNomeAgencia(nomenovo);
					contas.get(i).getBanco().setNumeroAgencia(numeronovo);
					System.out.println("dados atualizados");

				}
			}
		}
	}

}
