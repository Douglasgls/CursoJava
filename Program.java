package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a contidade pessoas: ");
		int n = sc.nextInt();
		
		List<Person> listaPessoas = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.print("tax payer # "+ (i+1) + "data: ");
			
			System.out.print("Pessoa: juridica ou fisica  (j/f): ");
			char choice = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			Double annIcome = sc.nextDouble();
			
			if (choice == 'j') {
				System.out.print("Numero de empregados: ");
				int numberEmplyee = sc.nextInt();
				listaPessoas.add(new LegalPerson(name, annIcome, numberEmplyee));
			}else {
				System.out.println("Gastos com Saúde: ");
				double gastoSaude = sc.nextDouble();
				listaPessoas.add(new PhysicalPerson(name, annIcome, gastoSaude));
			}
		}
		
		
		double taxas = 0.0;
		for (Person person : listaPessoas) {
			System.out.println(person.getName()+": $ " + person.taxCalculation() );
			taxas= taxas + person.taxCalculation();
		}
		
		
		System.out.println("Soma das Taxas $ " + taxas);
		
		sc.close();

	}

}
