package atividade01;

public class Autor {
	
	private String nome;
	private String CPF;
	private String endereco;
	
	
	public Autor(String nome, String cPF, String endereco) {
		this.nome = nome;
		CPF = cPF;
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	
	
	
	
	
	
	
	
}
