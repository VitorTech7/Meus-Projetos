package projeto;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tri; 
		double ldigual; 
		double doisldigual; 
		double lddiferente; 
		double triequi; 
		double triiso; 
		double triesca; 
		
		
		Scanner entrada = new Scanner(System.in); 
		
		
		System.out.println("Informe o primeiro lado: ");
		tri = entrada.nextDouble(); 
		System.out.println("Informe o segundo lado: ");
		tri = entrada.nextDouble(); 
		System.out.println("Informe o terceiro lado: ");
		tri = entrada.nextDouble(); 
		
		System.out.println();
		
		
		
		entrada.close(); 
		
		ldigual = triequi; 
		doisldigual = triiso; 
		lddiferente = triesca; 
		
		if(tri == ldigual) {
			System.out.println("Esse tri�ngulo � equil�tero");
		}else if(tri == doisldigual) {
			System.out.println("Esse tri�ngulo � is�celes");
		}else if(tri == lddiferente) {
			System.out.println("Esse tri�ngulo � escaleno");
		}else {
			
		}
		
		
		
	}

}
