package atividade03;

import java.util.ArrayList;

public class Turma {

	private int codigo;
	private String nome;
	private ArrayList<Estudante> estudantes;
	
	
	
	public Turma() {}
	
	
	public Turma(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.estudantes = new ArrayList<Estudante>();
	}
	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public ArrayList<Estudante> getEstudantes() {
		return estudantes;
	}


	public void setEstudantes(ArrayList<Estudante> estudantes) {
		this.estudantes = estudantes;
	}


	public void ListarEstudante() {
		System.out.println(this.codigo);
		for (int i = 0; i < estudantes.size(); i++) {
			System.out.println("Nome: " + estudantes.get(i).getNome() + "matricula: " + estudantes.get(i).getMatricula());
		}
		
	}
	
	public void AdicionarEstudante(Estudante estudante) {
		estudantes.add(estudante);
	}

	
}

