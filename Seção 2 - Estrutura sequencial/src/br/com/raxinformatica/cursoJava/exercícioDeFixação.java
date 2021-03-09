package br.com.raxinformatica.cursoJava;

import java.util.Locale;

public class exercícioDeFixação {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		Locale.setDefault(Locale.US);
		System.out.printf(product1 + ", which price is $ %.2f%n",price1);
		System.out.printf(product2 + ", which price is $ %.2f%n",price2);

		System.out.println("\nRecord: " +age + " years old, code: " + code + " and gender:" + gender);
      
		System.out.println("\nMeasure with a eigth decimal places: " + measure);
        System.out.printf("Rounded (tree decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);
	}
}
