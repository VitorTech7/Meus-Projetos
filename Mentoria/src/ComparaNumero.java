import java.util.Scanner;

public class ComparaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie uma classe java ComparaNumero que contenha um m�todo que receba
				//dois n�meros e indique se s�o iguais ou se s�o diferentes. Mostre o maior e o
				//menor (nesta sequ�ncia).
		
		int num1; 
		int num2; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o primeiro n�mero: ");
		num1 = entrada.nextInt(); 
		
		System.out.println("Informe o segundo n�mero: ");
		num2 = entrada.nextInt(); 
		
		
		entrada.close(); 
		
		if(num1 == num2) {
			System.out.println("Os n�meros s�o iguais");
		}else {
			System.out.println("Os n�meros s�o diferentes");
		}	System.out.println(" ");
		
		if(num1 > num2) {
			System.out.println("O n�mero 1 � maior, que �: " + num1);
		}else {
			System.out.println("O n�mero 2 � maior, que �: " + num2);
		}
		
	}

}
