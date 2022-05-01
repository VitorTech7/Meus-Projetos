import java.util.Scanner;

public class ClassePrinc {

	public static void main(String[] args) {
		
		
		double salario_bruto; 
		double valor_inss; 
		double valor_ir; 
		
		Scanner entrada = new Scanner(System.in); 
		
		
		inss in1 = new inss(); 
		
		
		System.out.println("Insira seu salario bruto: ");
		salario_bruto = entrada.nextDouble(); 
		
		System.out.println("Insira seu inss: ");
		valor_inss = entrada.nextDouble(); 
		
		System.out.println("Insira o seu ir: ");
		valor_ir = entrada.nextDouble(); 
		
		in1.calc_inss(salario_bruto, valor_inss, valor_ir); 
		
		
		
		
		
		
	}

}
