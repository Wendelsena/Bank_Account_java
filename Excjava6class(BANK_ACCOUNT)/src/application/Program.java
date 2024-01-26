package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client = null;
		
		System.out.println("Welcome to TaxHaven banking!\n");
		
		System.out.print("Enter account number: ");
		int accountnumber = sc.nextInt();
	
		sc.nextLine(); // consome a linha pendente.

		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("\nIs there na initial deposit (y/n)?: ");
		char response = Character.toLowerCase(sc.next().charAt(0)); // Character.toLowerCase para tornar as caracteres em minusculas.

		do {
			if (response == 'y') {
				System.out.print("Enter initial deposit value: ");
				double accountvalues = sc.nextDouble();
				client = new Client(name, accountnumber, accountvalues);
				System.out.println();
				System.out.println("Account data: \n" + client);
			} else if (response == 'n') {
				client = new Client(name, accountnumber);
				System.out.println();
				System.out.print("Account data: \n" + client);
			} else {
				System.out.println("Invalid response. Please enter 'y' or 'n'.");
			}

		} while (!(response == 'n' || response == 'y')); // "!" para dizer que quero o oposto. 
		
		System.out.println();
		System.out.print("\nEnter a deposit value: ");
		double accountvalues = sc.nextDouble();
		client.addValue(accountvalues);  // faz a atualização dentro do objeto addValue.
		System.out.print("Updated account data: \n" + client);
		
		System.out.println();
		System.out.print("\nEnter a withdraw value: ");
		accountvalues = sc.nextDouble();
		client.removeValue(accountvalues);
		System.out.print("Updated account data: \n" + client);
		
		sc.close();
	}

}
