package SomaVetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media = 0.0, soma = 0.0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		
		double[] vect = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < N; i++) {
			soma += vect[i];
		}
		
		media = soma / N;
		
		System.out.print("VALORES = ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
	
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();
	}

}
