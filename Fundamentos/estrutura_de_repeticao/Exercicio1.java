package estrutura_de_repeticao;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int senha = 2002;
	int x = 0;
	
	System.out.println("Digite sua senha: ");
	x = sc.nextInt();
	
	while (x != senha) {
			System.out.println("Senha incorreta!");
			x = sc.nextInt();
		}
	
	System.out.println("Acesso permitido");
	
	sc.close();
	
	}
}
