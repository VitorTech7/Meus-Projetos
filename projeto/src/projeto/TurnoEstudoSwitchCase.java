package projeto;

import java.util.Scanner;

public class TurnoEstudoSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char turno; 
		
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe qual turno voc� estuda meu consagrado: ");
		turno = entrada.next().charAt(0); 
		
		switch (turno) {
		
		case 'M':
			System.out.println("Bom dia flor do dia, o seu turno � matutino!");
			break; 
		case 'V':
			System.out.println("Boa tarde coleguinha, o seu truno � vespertino!");
			break; 
		case 'N':
			System.out.println("Boa noite gente boa, seu turno � noturno!");
			break; 
		
			default:
				System.out.println("Meu amigo, n�o tem esse turno!");
				
		}
		
		
		entrada.close(); 
		
		
	}

}
