package estrutura_condicional;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("Informe deu salario: ");
		salario = sc.nextDouble();
		
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (imposto == 0.0) {
			System.out.println("Isento de impostos");
		}
		else {
			System.out.printf("Imposto de renda: R$%.2f%n", imposto);
		} 
		
		sc.close();
	}

}
