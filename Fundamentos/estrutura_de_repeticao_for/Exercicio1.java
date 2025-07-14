package estrutura_de_repeticao_for;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, i;
		
		System.out.println("Digite um numero: ");
		x = sc.nextInt();
		
		for (i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);	
			}	
		}
		
		sc.close();
		
	}
}	
