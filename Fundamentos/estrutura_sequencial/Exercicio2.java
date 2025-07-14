package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		area = pi * raio * raio;
		
		System.out.printf("Area = %.4f%n", area);
		
		sc.close();
		
	}
	

}
