import java.util.Scanner;

public class ComparaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie uma classe java ComparaNumero que contenha um método que receba
				//dois números e indique se são iguais ou se são diferentes. Mostre o maior e o
				//menor (nesta sequência).
		
		int num1; 
		int num2; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o primeiro número: ");
		num1 = entrada.nextInt(); 
		
		System.out.println("Informe o segundo número: ");
		num2 = entrada.nextInt(); 
		
		
		entrada.close(); 
		
		if(num1 == num2) {
			System.out.println("Os números são iguais");
		}else {
			System.out.println("Os números são diferentes");
		}	System.out.println(" ");
		
		if(num1 > num2) {
			System.out.println("O número 1 é maior, que é: " + num1);
		}else {
			System.out.println("O número 2 é maior, que é: " + num2);
		}
		
	}

}
