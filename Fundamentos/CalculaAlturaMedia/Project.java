package CalculaAlturaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Project {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Pessoas[] pessoas = new Pessoas[n];
		
		System.out.println("Informe os dados da pessoas:");
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.println("Pessoa " + (i + 1));
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			System.out.println("Altura: ");
			double altura = sc.nextDouble(); 
			
			pessoas[n] = new Pessoas(nome, idade, altura);
			
		}
		
		double somaAltura = 0.0;
		
		for (int i = 0; i < n; i++) {
			somaAltura += pessoas[i].getAltura();
		}
		
		double menor16 = 0.0;
		String[] pessoaMenor16 = new String[n];
		
		for (int i = 0; i < n; i++) {
			if(pessoas[i].getIdade() < 16) {
				menor16++;
				pessoaMenor16[i] = pessoas[i].getNome();
			}
		}
		
		double media = somaAltura / n;
		
		System.out.println();
		System.out.printf("Altura media das pessoas: %.2f ", media);
		
		double porcentagemMenor16 = menor16 / n * 100.0;
		
		System.out.println();
		System.out.printf("Pessoas menores de 16 anos: %.2f%%%n", porcentagemMenor16);
		
		for (int i = 0; i <= menor16; i++) {
			if (menor16 > 0) {
				System.out.println("Nome: " + pessoaMenor16[i]);
			}
		}

		sc.close();
	}

}
