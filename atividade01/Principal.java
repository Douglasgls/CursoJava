package atividade01;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Livro> livros = new ArrayList<>();
		Livro livro = null;
		
		while(true) {
			
			System.out.println("1. Cadastrar livro\r\n"
					+ "2. Buscar livro por titulo (Buscar livro pelo titulo)\r\n"
					+ "3. Listar livros por autor (Mostrar os livros buscando pelo nome do autor)\r\n"
					+ "4. Listar todos os livros (Mostrar todos os livros cadastrados)\r\n"
					+ "0. Sair");
			
			int ch = sc.nextInt();
			
			if (ch == 1) {
				System.out.println("nome: ");
				String nomeAut = sc.next();
				System.out.println("cpf: ");
				String CPFAut = sc.next();
				System.out.println("endereco");
				String enderecoAut = sc.next();
				Autor autor = new Autor(nomeAut, CPFAut, enderecoAut);
				
				
				System.out.println("Nome: ");
				String nomeEdit = sc.next();
				System.out.println("cpnj: ");
				String CNPJEdit = sc.next();
				System.out.println("endereco: ");
				String enderecoEdit = sc.next();
				System.out.println("telfone: ");
				String telefoneEdit = sc.next();
				Editora editora = new Editora(CNPJEdit, nomeEdit, enderecoEdit, telefoneEdit);
				
				
				
				System.out.println("isbn: ");
				int isbn = sc.nextInt();
				System.out.print("titulo: ");
				String titulo = sc.next();
				System.out.println("Ano de edição: ");
				String anoEdicao = sc.next();
				
				livro = new Livro(autor, editora, isbn, titulo, anoEdicao);
				livros.add(livro);
				
			}
			
			else if (ch ==2) {
				System.out.println("Titulo: ");
				String titulo = sc.next();
				livro.BuscarLivroTitulo(titulo, livros);
			}else if (ch == 3) {
				System.out.println("Autor");
				String autor = sc.next();
				livro.BuscarLivroAutor(autor, livros);
			}else if (ch == 4) {
				System.out.println("livros: ");
				Livro.BuscarLivroTodos(livros);
			}else if (ch == 0) {
				break;
				
			}
			
			
			
			
			
			
		}
		
		
		
		
	}

}
