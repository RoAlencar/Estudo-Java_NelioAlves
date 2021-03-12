package br.com.raxinformatica.cursoJava.exercicio;

import java.util.Locale;
import java.util.Scanner;

import br.com.raxinformatica.cursoJava.exercicio.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account	account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter accont holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char responde = sc.next().charAt(0);

		if(responde == 'y') {
			System.out.print("\nEnter initial deposit value: ");
		    double initialDeposit = sc.nextDouble();
		    account = new Account(number, holder, initialDeposit);
		    
		} 
		else {
			account = new Account(number, holder);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.println("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);
        
        System.out.println("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);
        
		sc.close();

	}

}
