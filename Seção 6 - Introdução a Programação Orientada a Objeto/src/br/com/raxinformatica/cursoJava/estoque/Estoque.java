package br.com.raxinformatica.cursoJava.estoque;

import java.util.Locale;
import java.util.Scanner;

import br.com.raxinformatica.cursoJava.estoque.entities.estoqueEntidades;

public class Estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		estoqueEntidades entidades = new estoqueEntidades();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		entidades.name = sc.nextLine();
		System.out.print("Price: ");
		entidades.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		entidades.quantity = sc.nextInt();

		System.out.println("\nProduct data" + entidades);

		System.out.println("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		entidades.addProducts(quantity);

		System.out.println("\nUpdated data: " + entidades);

		System.out.println("\nEnter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		entidades.removeProducts(quantity);

		System.out.println("\nUpdated data: " + entidades);

		sc.close();
	}

}
