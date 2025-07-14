package estrutura_de_repeticao_for;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, x;
		int in = 0, out = 0;
		int i;
		
		System.out.println("Digite um numero: ");
		N = sc.nextInt();
		
		for (i = 0; i < N; i++) {
			System.out.println("Digite um numero: ");
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in + " in ");
		System.out.println(out + " out ");
		
		sc.close();
		
	}

}
