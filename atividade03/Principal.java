package atividade03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Turma> turmas = new ArrayList<>();
		Turma turma = null;
		
		while(true) {
			
			System.out.println("1. Cadastrar turma (O sistema deve permitir armazenar 10 turmas)\r\n"
					+ "2. Cadastrar estudante (É necessário buscar uma turma pelo código Antes de\r\n"
					+ "adicionar um estudante)\r\n"
					+ "3. Listar turmas (Exibir todas as turmas cadastradas)\r\n"
					+ "4. Listar estudantes por turma (Buscar turma pelo código)\r\n"
					+ "5. Consultar média de um estudante (Buscar pelo código da turma e número\r\n"
					+ "de matrícula do estudante)\r\n"
					+ "6. Alterar notas de um estudante (Buscar pelo código da turma e número de\r\n"
					+ "matrícula do estudante)\r\n"
					+ "7. Exibir média dos estudantes de uma turma (Buscar pelo código da turma e\r\n"
					+ "exibir a média dos estudantes da referida turma)\r\n"
					+ "0. Sair");
			int ch = sc.nextInt();
			
			
			if (ch == 1) {
				System.out.println("codigo turma: ");
				int cod = sc.nextInt();
				System.out.println("Nome turma: ");
				String nome = sc.next();
				
				turma = new Turma(cod, nome);
				if (turmas.size() <10) {
					turmas.add(turma);
				}else {
					System.out.println("numero de turma cheio");
				}
				
				
				
			}
			if(ch == 2) {
				System.out.println("codigo turma: ");
				int cod = sc.nextInt();
				boolean resposta = false;
				int index = -1;
				for (int i = 0; i < turmas.size(); i++) {
					if (cod == turmas.get(i).getCodigo()) {
						resposta = true;
						index = i;
					}
				}
				if (resposta) {
					int[] notas = new int[4];
					System.out.println("matricula ");
					int matricula = sc.nextInt();
					System.out.println("Nome estudante: ");
					String nome = sc.next();
					System.out.println("notas: ");
					for (int i = 0; i < notas.length; i++) {
						System.out.println("nota " + i);
						notas[i] = sc.nextInt();
					}
					Estudante est = new Estudante(matricula, nome, notas);
					turmas.get(index).AdicionarEstudante(est);
					
					}
				}else if(ch ==3) {
					System.out.println("Turmas cadastradas: ");
					for (int i = 0; i < turmas.size(); i++) {
						System.out.println("Turma: "+ turmas.get(i).getNome() + "  Código: " + turmas.get(i).getCodigo() );
					}
				}
				else if (ch == 4) {
					for (int i = 0; i < turmas.size(); i++) {
						System.out.println("Turma: "+ turmas.get(i).getNome() );
						for (int j = 0; j < turmas.get(i).getEstudantes().size(); j++) {
							System.out.println( turmas.get(i).getEstudantes().get(j).getNome());
							
						}

					}
					
				}else if (ch == 5) {
					System.out.println("Codigo turma: ");
					int codTurma = sc.nextInt();
					System.out.println("Matricula Estudante: ");
					int matEstudante = sc.nextInt();
					
					for (int i = 0; i < turmas.size();i++) {
						if (codTurma == turmas.get(i).getCodigo()) {
							for (int j = 0; j < turmas.get(i).getEstudantes().size(); j++) {
								if (matEstudante == turmas.get(i).getEstudantes().get(j).getMatricula()) {
									System.out.println("Aluno: " +  turmas.get(i).getEstudantes().get(j).getNome() );
									int[] notas =  turmas.get(i).getEstudantes().get(j).getNotas();
									turmas.get(i).getEstudantes().get(j).media(notas);
									break;
								}
								
							}
						}
						
					}
				} else if (ch == 6) {
					System.out.println("Codigo turma: ");
					int codTurma = sc.nextInt();
					System.out.println("Matricula Estudante: ");
					int matEstudante = sc.nextInt();
					
					for (int i = 0; i < turmas.size();i++) {
						if (codTurma == turmas.get(i).getCodigo()) {
							for (int j = 0; j < turmas.get(i).getEstudantes().size(); j++) {
								if (matEstudante == turmas.get(i).getEstudantes().get(j).getMatricula()) {
									System.out.println("Aluno: " +  turmas.get(i).getEstudantes().get(j).getNome() );
									
									int[] notas =  new int[4];
									for (int k = 0; k < notas.length; k++) {
									System.out.println("nota " + k);
									notas[k] = sc.nextInt();
									}
									turmas.get(i).getEstudantes().get(j).setNotas(notas);
								
									}
								
								}
							}
						
						}
					
				}else if (ch == 7) {
					System.out.println("Codigo turma: ");
					int codTurma = sc.nextInt();
					
					for (int i = 0; i < turmas.size(); i++) {
						if (codTurma == turmas.get(i).getCodigo()) {
							for (int j = 0; j < turmas.get(i).getEstudantes().size(); j++) {
								System.out.print("nome: " + turmas.get(i).getEstudantes().get(j).getNome());
								int[] notas =  turmas.get(i).getEstudantes().get(j).getNotas();
								turmas.get(i).getEstudantes().get(j).media(notas);
							}
						}
						
					}
				}
				else if (ch == 0) {
					break;
				}
				
			
			
			
			
			
			
			}		
			
		}
		

	}


