import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1; 
		int numero2; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Insira o primeiro n�mero: ");
		numero1 = entrada.nextInt(); 
		
		System.out.println("insira o segundo n�mero: ");
		numero2 = entrada.nextInt(); 
		
		entrada.close(); 
		
		if (numero1 > numero2) {
			System.out.println("O maior n�mero �: " + numero1);
		} else {
			System.out.println("O maior n�mero �: " + numero2);
		
		}
		
		
		
		
		
		
		
	}

}
