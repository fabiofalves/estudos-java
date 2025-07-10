package estrutura_sequencial;

import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		float yf;
		String name;
		
		x = sc.nextInt();
		yf = sc.nextFloat();
		name = sc.next();
		
		System.out.println(x);
		System.out.println(yf);
		System.out.println(name);
		
		
		sc.close();
		
	}
}
