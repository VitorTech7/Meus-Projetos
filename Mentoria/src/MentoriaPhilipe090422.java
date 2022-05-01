import java.util.Scanner;

public class MentoriaPhilipe090422 {

	public static void main(String[] args) {
		
		double nota1; 
		double nota2; 
		double nota3; 
		double nota4; 
		double media; 
		
		
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
		
		media = (nota1 + nota2 + nota3 + nota4)/4; 
		
		entrada.close();
		
		
		
		if(media >= 7) {
			System.out.println("Parabéns você passou, sua média é: " + media);
		
		} else {
			System.out.println("Infelizmente ficou na recuperação, sua média é: " + media);
		}
			
		
		
		
		
		
		
		 
		
	}

}
