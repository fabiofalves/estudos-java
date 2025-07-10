package estrutura_condicional;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		System.out.println("Digite um valor: ");
		x = sc.nextDouble();
		
		if (x < 0.0 || x > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (x <= 25.0) {
			System.out.println("Intervalo [0.25]");
		}
		else if (x <= 50.0) {
			System.out.println("Intervalo [25.50]");
		}
		else if (x <= 75.0) {
			System.out.println("Intervalo [50.75]");
		}
		else {
			System.out.println("intervalo [75.100]");
		}
		
		sc.close();
	}

}
