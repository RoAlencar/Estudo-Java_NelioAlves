package br.com.raxinformatica.cursoJava.construtores;

import java.util.Locale;
import java.util.Scanner;

import br.com.raxinformatica.cursoJava.construtores.entities.construtoresEntities;



public class Construtores {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		construtoresEntities entities = new construtoresEntities(name, price);

		entities.setName("Computer");
		System.out.println("\nUpdated name: " + entities.getName());
		entities.setPrice(1200.00);
		System.out.println("Updated price: " + entities.getPrice());
		
		System.out.println("\nProduct data " + entities);

		System.out.println("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		entities.addProducts(quantity);

		System.out.println("\nUpdated data: " + entities);

		System.out.println("\nEnter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		entities.removeProducts(quantity);

		System.out.println("\nUpdated data: " + entities);

		sc.close();
	}

}
