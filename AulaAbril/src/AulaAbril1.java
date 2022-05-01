import java.util.Scanner;

public class AulaAbril1 {

	public static void main(String[] args) {
		
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0; 
		double nota4 = 0.0; 
		double media = 0.0; 
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos calcular a média: ");
		
		System.out.println("");
		
		System.out.println("Informe a primeira nota: ");
		nota1 = entrada.nextDouble(); 
		
		System.out.println("Informe a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = entrada.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = entrada.nextDouble(); 
		
		System.out.println("=======================================");
		
		
		entrada.close(); 
	
		media = (nota1 + nota2 + nota3 + nota4)/4; 
		
		System.out.println("Olá meu caro amigo, sua média é:  "+ media);
		
		
		
		
		
		
		
	}

}
