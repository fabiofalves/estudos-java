package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159* C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("Triangulo = %.3f%n", triangulo);
		System.out.printf("Circulo = %.3f%n", circulo);
		System.out.printf("Trapezio = %.3f%n", trapezio);
		System.out.printf("Quadrado = %.3f%n", quadrado);
		System.out.printf("Retangulo = %.3f%n", retangulo);
		
		sc.close();
	}

}
