package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int x, y, s;
			
			x = sc.nextInt();
			y = sc.nextInt();
			
			s = x + y;
			
			System.out.println("A soma entre " + x + " e " + y + " e igual a " + s);
			
			sc.close();
		
	}

}
