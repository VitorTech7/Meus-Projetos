package projeto;

import java.util.Scanner;

public class Crime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int result1; 
		int result2; 
		int result3; 
		int result4; 
		int result5; 
		int soma; 
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Telefonou para a v�tima? 1 para sim, 0 para n�o");
		result1 = entrada.nextInt(); 
		System.out.println("Esteve no local do crime? 1 para sim, 0 para n�o");
		result2 = entrada.nextInt(); 
		System.out.println("Mora perto da v�tima? 1 para sim, 0 para n�o");
		result3 = entrada.nextInt(); 
		System.out.println("Devia para a v�tima? 1 para sim, 0 para n�o");
		result4 = entrada.nextInt(); 
		System.out.println("J� trabalhou com a v�tima? 1 para sim, 0 para n�o");
		result5 = entrada.nextInt(); 
		
		 soma = result1 + result2 + result3 + result4 + result5; 
		
		
		entrada.close(); 
		
		if(soma == 2) {
			System.out.println("Suspeito");
		}else if(soma ==3 || soma ==4) {
			System.out.println("Comparsa");
		}else if(soma ==5) {
			System.out.println("Matador");
		}else {
			System.out.println("Sem culpa");
		}
			
		
		
		
		
			
	}

}
