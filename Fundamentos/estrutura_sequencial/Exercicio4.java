package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
		double ValorHora, Salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		ValorHora = sc.nextDouble();
		Salario = horas * ValorHora;
		
		System.out.printf("Number = %d%nSalary = U$%.2f%n", numero, Salario);
		
		sc.close();
	}
}
