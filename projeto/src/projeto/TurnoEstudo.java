package projeto;

import java.util.Scanner;

public class TurnoEstudo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char turno; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Em que turno você estuda? (M = matutino, V = vespertino, N = noturno) ");
		turno = entrada.next().charAt(0); 
		
		
		entrada.close(); 
		
		if(turno == 'M') {
			System.out.println("Bom dia, o seu turno é matutino");
		}else if(turno == 'V') {
			System.out.println("Boa tarde, o seu turno é vespertino");
		}else if(turno == 'N') {
			System.out.println("Boa noite, o seu turno é noturno");
		}else {
			System.out.println("Turno inválido");
		}
		
		
		
		
	}

}
