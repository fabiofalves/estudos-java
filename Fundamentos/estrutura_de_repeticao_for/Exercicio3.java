package estrutura_de_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
	
		System.out.println("Quantos casos de teste voce quer fazer? ");
		N = sc.nextInt();
		
		for (i = 0; i < N; i++) {
			System.out.println("Digite 3 numeros: ");
			double x = sc.nextFloat();
			double y = sc.nextFloat();
			double z = sc.nextFloat();
			
			double media = (x*2.0 + y*3.0 + z*5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
			
		}
	
		sc.close();
		
		
	}

}
