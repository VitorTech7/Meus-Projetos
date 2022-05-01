package projeto;

import java.util.Scanner;

public class ParImpar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int parimpar; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		
		System.out.println("Informe um número: ");
		parimpar = entrada.nextInt(); 
		
		entrada.close(); 
		
		if(parimpar % 2 == 0) {
			System.out.println("O número é Par ");
		}
		else {
			System.out.println("O número é impar");
		
		}
		
	}

}
