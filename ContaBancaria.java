package entidade;

public class ContaBancaria {
	private int numeroDaConta;
	private String nome;
	private double saldo;
	private static final int taxa = 5;
	
	public ContaBancaria(int numeroConta, String nome, double depositoInicial) {
		this.numeroDaConta = numeroConta;
		this.nome = nome;
		SaldoDeposito(depositoInicial);
	}

	public ContaBancaria(int numeroDaConta, String nome) {
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		saldo = 0.0;
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}
	

	
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}


	public double getSaldo() {
		return saldo;
	}


	public double SaldoDeposito(double saldo) {
		return this.saldo+=saldo;
	}
	
	
	public double SaldoSaque(double saldo) {
		return this.saldo-=(saldo+taxa);
	}
	
	
	
	public String toString() {
		return "numero da conta: "
				+ getNumeroDaConta()
				+ "  nome:  "
				+ nome
				+ "  Saldo:  "
				+ saldo;
	}
}
