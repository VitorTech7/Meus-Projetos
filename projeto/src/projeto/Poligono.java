package projeto;

import java.util.Scanner;

public class Poligono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int poligono;
		int apotema = 5;
		
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Quantos lados tem seu Poligono? ");
		poligono = sc.nextInt();
		
		if(poligono == 3) {
			
			System.out.println("Informe as medidas do Triangulo: ");
			
			System.out.println(" ");
			
			System.out.println("Informe a Altura: ");
			int altura = sc.nextInt();
			System.out.println("Informe a base: ");
			int base = sc.nextInt();
			
			
			int area = (base * altura)/2;
			
			System.out.println("O Poligono informado foi TRIANGULO:" );
			System.out.println("O valor da Area é: " + area + " cm");
			
			}else if(poligono == 4) {
			System.out.println("Informe as medidas do Quadrado");
			
			System.out.println(" ");
			
			System.out.println("Informe a largura do lado 1: ");
			int lado1 = sc.nextInt();
			System.out.println("Informe a largura do lado 2: ");
			int lado2 = sc.nextInt();
			
			int area_quadrado = (lado1 * lado2);
			
			System.out.println("O valor da Area do Quadrado é: " + area_quadrado);
			
			}else if(poligono == 5) {
			
			System.out.println("Informe as medidas do Pentagono: ");
			System.out.println(" ");
			
			System.out.println("Informe o lado 1: ");
			int lado1 = sc.nextInt();
			System.out.println("Informe o lado 2: ");
			int lado2 = sc.nextInt();
			System.out.println("Informe o lado 3: ");
			int lado3 = sc.nextInt();
			System.out.println("Informe o lado 4: ");
			int lado4 = sc.nextInt();
			System.out.println("Informe o lado 5: ");
			int lado5 = sc.nextInt();
			
			int perimetro = (lado1 + lado2 + lado3 + lado4 + lado5);
			int area_penta = (perimetro * apotema)/2;
			
			System.out.println("O Poligono informado é um PENTAGONO");
			System.out.println("O valor da area do pentagono é: " + area_penta);
		  }else {
			System.out.println("Esse poligono não existe!");
		}
		
		
		sc.close();

		}

}
