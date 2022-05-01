package projeto;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1; 
		int num2; 
		int num3; 
		int i = 0; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o número 1: "); 
		num1 = entrada.nextInt(); 
		
		while(i <= num1) {
			System.out.println("Ordem:" + i++);
		}
		
		System.out.println("Informe o número 2: ");
		num2 = entrada.nextInt(); 
		
		while(i <= num2) {
			System.out.println("Ordem: " + i++);
		}
		
		System.out.println("Informe o número 3: ");
		num3 = entrada.nextInt(); 
		
		while(i <= num3) {
			System.out.println("Ordem: " + i++);
		}
		
		
		
		entrada.close(); 
		
		
		
	}

}
