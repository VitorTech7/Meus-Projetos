package projeto;

import java.util.Scanner;

public class MortalidadeNatalidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char taxa; 
		double taxa_natalidade; 
		double taxa_mortalidade; 
		double num_nasci; 
		double num_hab; 
		double num_obt; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite [N] para calcular a taxa de natalidade ou [M] para calcular a taxa de mortalidade: ");
		taxa = entrada.next().charAt(0); 
		
		
		
		switch(taxa) {
		
		case 'N':
			System.out.println("Digite o número de nascimento: ");
			num_nasci = entrada.nextDouble(); 
			System.out.println("Digite o número de habitantes: ");
			num_hab = entrada.nextDouble(); 
			taxa_natalidade = (num_nasci * 1000)/num_hab;
			System.out.println("A taxa de natalidade é: " + taxa_natalidade);
		
			break; 
		
		
		case 'M':
			System.out.println("Digite o número de óbitos: ");
			num_obt = entrada.nextDouble(); 
			System.out.println("Digite o números de habitantes: ");
			num_hab = entrada.nextDouble();
			taxa_mortalidade = (num_obt * 1000)/num_hab; 
			System.out.println("A taxa de mortalidade é: " + taxa_mortalidade);
			
			break; 
			
			default:
				System.out.println("Opção inválida");
		
		
		
		}
				
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
