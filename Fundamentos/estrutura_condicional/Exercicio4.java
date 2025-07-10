package estrutura_condicional;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horainicio, horafinal, duracao;
		int diainteiro = 24;
		
		System.out.println("Digite a hora inicial e a hora final: ");
		horainicio = sc.nextInt();
		horafinal = sc.nextInt();
		
		if (horainicio < horafinal) {
			duracao = horafinal - horainicio;
		}
		else {
			duracao = diainteiro - horainicio + horafinal;
		}
		
		System.out.println("O jogo durou " + duracao + " horas ");
		
		sc.close();
	}

}
