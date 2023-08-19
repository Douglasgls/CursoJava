package atividade01;

import java.util.ArrayList;

public class Livro {
	
	private Autor autor;
	private Editora editora;
	private int ISBN;
	private String titulo;
	private String anoEdicao;
	
	public Livro() {}
	
	public Livro(Autor autor, Editora editora, int iSBN, String titulo, String anoEdicao) {
		super();
		this.autor = autor;
		this.editora = editora;
		ISBN = iSBN;
		this.titulo = titulo;
		this.anoEdicao = anoEdicao;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoEdicao() {
		return anoEdicao;
	}

	public void setAnoEdicao(String anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	
	
	public void BuscarLivroAutor(String autor, ArrayList<Livro> livros) {
		
		for (int i = 0; i < livros.size(); i++) {
			if (autor.equals(livros.get(i).getAutor().getNome())) {
				 System.out.println("Informações do Livro:");
			        System.out.println("Título: " + livros.get(i).getTitulo());
			        System.out.println("Autor: " + livros.get(i).getAutor().getNome());
			        System.out.println("Editora: " + livros.get(i).getEditora().getNome());
			        System.out.println("ISBN: " + livros.get(i).getISBN());
			        System.out.println("Ano de Edição: " + livros.get(i).getAnoEdicao());
				
				}
			}
		
		}
	
	public void BuscarLivroTitulo(String titulo,ArrayList<Livro> livros) {
		
		for (int i = 0; i < livros.size(); i++) {
				if (titulo.equals(livros.get(i).getTitulo())) {
			 System.out.println("Informações do Livro:");
		        System.out.println("Título: " + livros.get(i).getTitulo());
		        System.out.println("Autor: " + livros.get(i).getAutor().getNome());
		        System.out.println("Editora: " + livros.get(i).getEditora().getNome());
		        System.out.println("ISBN: " + livros.get(i).getISBN());
		        System.out.println("Ano de Edição: " + livros.get(i).getAnoEdicao());
				}
			}
		}
	
	
	public static void BuscarLivroTodos(ArrayList<Livro> livros) {
		for (int i = 0; i < livros.size(); i++) {
			System.out.println("livro: " + livros.get(i).titulo);
		}
	}
	
	
	
	
}
