package projeto;

import java.util.Scanner;

public class FormaPagamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char for_pagto; 
		double avista;
		double aprazo; 
		double desconto; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Insira a forma de pagamento, sendo [1] � vista e [2] � prazo.");
		for_pagto = entrada.next().charAt(0); 
		
		 
		
		switch(for_pagto) {
		
		case '1':
			System.out.println("Insira o valor � vista: ");
			avista = entrada.nextDouble(); 
			desconto = (avista) * 0.90;
			System.out.println("O seu valor com o desconto � de: " + desconto);
			
			
		
			break;
			
		case '2':
			System.out.println("Insira o valor � prazo: ");
			aprazo = entrada.nextDouble(); 
			System.out.println("O seu valor � prazo � " + aprazo);
			
			break; 
			
			default:
				System.out.println("Op��o inv�lida");
			
			
			
			
		
		}
		
		
		
		
		entrada.close(); 
		

	}

}
