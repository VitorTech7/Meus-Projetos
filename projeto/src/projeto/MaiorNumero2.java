package projeto;

import java.util.Scanner;

public class MaiorNumero2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1; 
		int num2; 
		int num3; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o primeiro n�mero: ");
		num1 = entrada.nextInt(); 
		System.out.println("Informe o segundo n�mero: ");
		num2 = entrada.nextInt(); 
		System.out.println("Informe o terceiro n�mero: ");
		num3 = entrada.nextInt(); 
		
		entrada.close(); 
		
		
		if(num1 > num2)  {
			if(num1 > num3)
			System.out.println("O primeiro n�mero � o maior, ele �: " + num1);
			
		} if(num2 > num1) {
			if(num2 > num3)
			System.out.println("O segundo n�mero � o maior, ele �: " + num2);
		
		}if(num3 > num1) {
			if(num3 > num2)
			System.out.println("O terceiro n�mero � o maior, ele �: " + num3);
			
		}else {
			
		}
		
		
		
		
		
		
	}

}
