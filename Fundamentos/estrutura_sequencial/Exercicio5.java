package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qntd1, qntd2;
		double valor1, valor2, totalapagar;
		
		cod1 = sc.nextInt();
		qntd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qntd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		totalapagar = (qntd1 * valor1) + (qntd2 * valor2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n", totalapagar);
		
		sc.close();
	}

}
