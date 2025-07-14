package estrutura_condicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um numero: ");
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("Numero negativo");
		}
		else {
			System.out.println("Numero positivo");
		}
		
		sc.close();
	}

}
