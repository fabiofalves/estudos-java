package estrutura_condicional;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod, quantidade;
		double total;
		
		System.out.println("Digite o codigo e a quantidade do produto: ");
		cod = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (cod == 1) {
			total = quantidade * 4.0;
			System.out.println("Total a pagar R$" + total);
		}
		else if (cod == 2) {
			total = quantidade * 4.5;
			System.out.println("Total a pagar R$" + total);
		}
		else if (cod == 3) {
			total = quantidade * 5.0;
			System.out.println("Total a pagar R$" + total);
		}
		else if (cod == 4) {
			total = quantidade * 2.0;
			System.out.println("Total a pagar R$" + total);
		}
		else if(cod == 5) {
			total = quantidade * 1.5;
			System.out.println("Total a pagar R$" + total);
		}
		else {
			System.out.println("Codigo invalido");
		}
		
		sc.close();
	}

}
