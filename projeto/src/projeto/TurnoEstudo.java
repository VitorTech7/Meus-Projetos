package projeto;

import java.util.Scanner;

public class TurnoEstudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char turno; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Em que turno voc� estuda? (M = matutino, V = vespertino, N = noturno) ");
		turno = entrada.next().charAt(0); 
		
		
		entrada.close(); 
		
		if(turno == 'M') {
			System.out.println("Bom dia, o seu turno � matutino");
		}else if(turno == 'V') {
			System.out.println("Boa tarde, o seu turno � vespertino");
		}else if(turno == 'N') {
			System.out.println("Boa noite, o seu turno � noturno");
		}else {
			System.out.println("Turno inv�lido");
		}
		
		
		
		
	}

}
