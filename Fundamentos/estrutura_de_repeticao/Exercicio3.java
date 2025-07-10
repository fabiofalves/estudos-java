package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.println("Selecione qual combustivel voce prefere: ");
		System.out.printf("1 - Alcool%n2 - Gasolina%n3 - Diesel%n4 - Sair%n ");
		opcao = sc.nextInt();
		
		while(opcao != 4) {
			
			if (opcao == 1) {
				alcool = alcool + 1;
			}
			else if (opcao == 2) {
				gasolina = gasolina + 1;
			}
			else if (opcao == 3) {
				diesel = diesel +1;
			}
			else {
				System.out.println("Opcao invalida");
			}
			
			System.out.println("Selecione qual combustivel voce prefere: ");
			System.out.printf("1 - Alcool%n2 - Gasolina%n3 - Diesel%n4 - Sair%n ");
			opcao = sc.nextInt();
		
			}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
		
		sc.close();
		}
	}

