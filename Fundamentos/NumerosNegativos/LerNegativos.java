package NumerosNegativos;

import java.util.Locale;
import java.util.Scanner;

public class LerNegativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;		
		do {
			System.out.print("Quantos numeros voce quer adicionar no vetor (max 10) ? ");
			N = sc.nextInt();
			if (N < 0 || N > 10) {
				System.out.println("Numero invalido, digite um numero inteiro (max 10)");
			}
		} while (N < 0 || N > 10);
		
		int[] vect = new int[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos: ");
		
		for (int i = 0; i < N; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
