package atividade03;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
	private int matricula;
	private String nome;
	private int[] notas = new int[4];


	public Estudante(int matricula, String nome, int[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
		
	}




	public int getMatricula() {
		return matricula;
	}




	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int[] getNotas() {
		return notas;
	}




	public void setNotas(int[] notas) {
		this.notas = notas;
	}




	public void media(int[] notas) {
	double soma = 0;
	for (int i = 0; i < notas.length; i++) {
	soma+=notas[i];
	}

	System.out.println("media: " + soma/notas.length);
	}
}
