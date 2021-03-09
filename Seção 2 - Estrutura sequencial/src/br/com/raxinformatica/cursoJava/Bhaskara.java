package br.com.raxinformatica.cursoJava;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		 try (Scanner sc = new Scanner(System.in)) {
			double delta, x1, x2;
			 System.out.println("Numeros para Bhaskara");
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 int c = sc.nextInt();
			 
			 
			 delta = Math.pow(b, 2.0) - 4*a*c;
			 
			 x1 = (-b + Math.sqrt(delta)) /(2.0 * a);
			 x2 = (-b - Math.sqrt(delta)) /(2.0 * a);
		
			 System.out.println(x1);
			 System.out.println(x2);
		 }
		
		 
		 
	}
}
