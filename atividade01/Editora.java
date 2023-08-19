package atividade01;

public class Editora {

	private String CNPJ;
	private String nome;
	private String endereco;
	private String telefone;
	
	
	public Editora(String cNPJ, String nome, String endereco, String telefone) {
		CNPJ = cNPJ;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
