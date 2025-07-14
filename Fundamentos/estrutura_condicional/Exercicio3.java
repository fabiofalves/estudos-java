package estrutura_condicional;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0){
			System.out.println("Os numeros digitados sao multiplos");
		}
		else{
			System.out.println("Os numeros nao sao multiplos ");
		}
		
		sc.close();
	}

}
