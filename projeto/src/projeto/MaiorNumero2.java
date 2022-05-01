package projeto;

import java.util.Scanner;

public class MaiorNumero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1; 
		int num2; 
		int num3; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o primeiro número: ");
		num1 = entrada.nextInt(); 
		System.out.println("Informe o segundo número: ");
		num2 = entrada.nextInt(); 
		System.out.println("Informe o terceiro número: ");
		num3 = entrada.nextInt(); 
		
		entrada.close(); 
		
		
		if(num1 > num2)  {
			if(num1 > num3)
			System.out.println("O primeiro número é o maior, ele é: " + num1);
			
		} if(num2 > num1) {
			if(num2 > num3)
			System.out.println("O segundo número é o maior, ele é: " + num2);
		
		}if(num3 > num1) {
			if(num3 > num2)
			System.out.println("O terceiro número é o maior, ele é: " + num3);
			
		}else {
			
		}
		
		
		
		
		
		
	}

}
