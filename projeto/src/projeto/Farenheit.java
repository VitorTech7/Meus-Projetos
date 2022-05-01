package projeto;

import java.util.Scanner;

public class Farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double celsius;   
		double conversaofarenheit; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o Grau Celsius: ");
		 celsius = entrada.nextDouble(); 
		
		 
		entrada.close();
		
		conversaofarenheit = (celsius * 1.8)+32;
		
		
		System.out.println("A temperatura em Fahrenheit é: "  +conversaofarenheit + " F°");
		
		
		
		
		
		
		
		
		
	}

}
