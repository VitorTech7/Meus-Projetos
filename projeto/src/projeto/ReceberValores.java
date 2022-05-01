package projeto;

import java.util.Scanner;

public class ReceberValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor1; 
		int valor2; 
		int valor3; 
		int valor4; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Insira o primeiro valor: ");
		valor1 = entrada.nextInt(); 
		
		System.out.println("Insira o segundo valor: ");
		valor2 = entrada.nextInt();
		
		System.out.println("Insira o terceiro valor: ");
		valor3 = entrada.nextInt(); 
		
		System.out.println("Insira o quarto valor: ");
		valor4 = entrada.nextInt(); 
		
		entrada.close(); 
		
		
		
		System.out.println("Os valores digitados são: "); 
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println(valor4);
		
		
	}

}
