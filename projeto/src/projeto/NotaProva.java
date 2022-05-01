package projeto;

import java.util.Scanner;

public class NotaProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe a nota: ");
		nota = entrada.nextDouble(); 
		
		entrada.close(); 
		
		
		if(nota >= 7) {
			System.out.println("Você passou: ");
		}else if(nota >= 5) {
			System.out.println("Você está em recuperação: ");
		}else {
			System.out.println("Você está reprovado: ");
			
		}
	}

}
