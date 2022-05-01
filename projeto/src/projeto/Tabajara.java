package projeto;

import java.util.Scanner;

public class Tabajara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sal; 
		
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o seu salário");
		sal = entrada.nextDouble(); 
		
		entrada.close(); 
		
		if (sal <= 280) {
			System.out.println("O seu percentual foi de 20%"); 
			System.out.println("O seu aumento foi de: R$ " + sal * 0.2);
			System.out.println("O seu novo salário é de : R$ " + sal * 1.20);
		}else if(sal <= 700) {
			System.out.println("O seu percentual foi de 15%"); 
			System.out.println("O seu aumento foi de: R$ " + sal * 0.15);
			System.out.println("O seu novo salário é de : R$ " + sal * 1.15);
		}else if(sal < 1500) {
			System.out.println("O seu percentual foi de 10%"); 
			System.out.println("O seu aumento foi de: R$ " + sal * 0.10);
			System.out.println("O seu novo salário é de : R$ " + sal * 1.10);
		}else if(sal >= 1500) {
			System.out.println("O seu percentual foi de 5%"); 
			System.out.println("O seu aumento foi de: R$ " + sal * 0.05);
			System.out.println("O seu novo salário é de : R$ " + sal * 1.05);
		}else {
			System.out.println("Ganha bem. ");
		}
		
		
	
		
		
		
		
	}

}
