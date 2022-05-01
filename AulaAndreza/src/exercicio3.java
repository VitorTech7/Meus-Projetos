import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		
		String nome; 
		int idade; 
		String CPF; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		
		System.out.println("Vamos ver se você tira a CNH: ");
		
		System.out.println("");
		
		System.out.print("Informe o seu nome: ");
		nome = entrada.next(); 
		
		System.out.print("Informe a sua idade: ");
		idade = entrada.nextInt(); 
		
		System.out.print("Informe o seu CPF: ");
		CPF = entrada.next(); 
		
		
		System.out.println("==============================");
		
		
		entrada.close(); 
		
		
		if(idade >= 16) {
			System.out.println("você está apto,parábens : " +idade);
			
		} else {
			System.out.println("Você está inapto: ");
		
		}
		
		
	}

}
