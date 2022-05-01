package projeto;

import java.util.Scanner;

public class NotasParciais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1; 
		double nota2; 
		double media; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe a primeira nota");
		nota1 = entrada.nextDouble(); 
		System.out.println("Informe a segunda nota");
		nota2 = entrada.nextDouble(); 
		
		media = (nota1 + nota2)/2; 
		
		entrada.close(); 
		
		if(media >= 9.0) {
			System.out.println("Aprovado");
			System.out.println("CONCEITO A");
		}else if(media >= 7.5) {
			System.out.println("Aprovado");
			System.out.println("CONCEITO B");
		}else if(media >= 6.0) {
			System.out.println("Aprovado");
			System.out.println("CONCEITO C");
		}else if(media >=4.0) {
			System.out.println("Reprovado");
			System.out.println("CONCEITO D");
		}else {
			System.out.println("Reprovado");
			System.out.println("CONCEITO E");
		}
			
			
		
		
		
		
		
	}

}
