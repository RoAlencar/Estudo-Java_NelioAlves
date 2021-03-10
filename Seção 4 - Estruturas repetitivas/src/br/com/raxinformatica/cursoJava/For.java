package br.com.raxinformatica.cursoJava;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a quantidade de numeros: ");
		int N = sc.nextInt();
		
		int soma = 0;
		for  (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
	}
		System.out.println("A soma dos " + N +" numeros é: " + soma);
		
		sc.close();
}
}
