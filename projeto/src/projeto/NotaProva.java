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
			System.out.println("Voc� passou: ");
		}else if(nota >= 5) {
			System.out.println("Voc� est� em recupera��o: ");
		}else {
			System.out.println("Voc� est� reprovado: ");
			
		}
	}

}
