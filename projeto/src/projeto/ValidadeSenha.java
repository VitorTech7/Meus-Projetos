package projeto;

import java.util.Scanner;

public class ValidadeSenha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int senha; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe a senha: ");
		senha = entrada.nextInt(); 
		
		entrada.close(); 
		
		if(senha == 1234) {
			System.out.println("A senha está correta");
		}else {
			System.out.println("A senha está incorreta");
		}
		
		
		
		
		
	}

}
