package projeto;

import java.util.Scanner;

public class Maca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double macad;
		double macamd;
		int quant; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Quantas maçãs você vai levar? ");
		quant = entrada.nextInt(); 
		
		entrada.close(); 
		
		macamd = (0.30 * quant); 
		macad = (0.25 * quant); 
		
		if(quant < 12) {
			System.out.println("Essas são as quantides de maçã:" + quant); 
			System.out.println("O valor é: " + macamd);
		}else if(quant >= 12) {
			System.out.println("Essas são as quantides de maçã:" + quant);
			System.out.println("O valor é: " + macad);
		}else {
			System.out.println("");
			
		}
		
		
		
		
		
	}

}
