package projeto;

import java.util.Scanner;

public class ValorInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1; 
		int number2; 
		int number3; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Insira o n�mero 1: ");
		number1 = entrada.nextInt(); 
		System.out.println("Insira o n�mero 2: ");
		number2 = entrada.nextInt(); 
		System.out.println("Insira o n�mero 3: ");
		number3 = entrada.nextInt(); 
		
		entrada.close(); 
		
		if(number1 > number2) {
			System.out.println(number1 + " � o maior");
		}else if(number1 > number3) {
			System.out.println(number1 + " � o maior");
		}else if(number2 > number1) {
			System.out.println(number2 + " � o maior");
		}else if(number2 > number3) {
			System.out.println(number2 + " � o maior");
		}else if(number3 > number1) {
			System.out.println(number3 + " � o maior");
		}else if(number3 > number2) {
			System.out.println(number3 + " � o maior");
		}else{
			
		}
		
		
		
		
		
	}

}
