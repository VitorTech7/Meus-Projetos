import java.util.Scanner;

public class Algoritmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x; 
		double y; 
		double z; 
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Informe o valor de x: ");
		x = entrada.nextDouble(); 
		
		System.out.println("Informe o valor de y: ");
		y = entrada.nextDouble(); 
		
		
		z = (x * y) + 5; 
		
		entrada.close(); 
		
		if(z <= 0) {
			System.out.println("Z vale: " + z);
			z = entrada.nextDouble(); 
			System.out.println("A resposta é: A");
		}else if(z <= 100){
			System.out.println("A resposta é: B");
		}else {
			System.out.println("A resposta é: C");
		}
		
		
		
		
	}

}
