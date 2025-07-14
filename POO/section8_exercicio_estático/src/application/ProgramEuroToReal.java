package application;

import java.util.Locale;
import java.util.Scanner;

import util.EuroConverter;

public class ProgramEuroToReal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double euroPrice, spentEuros, result;
		
		System.out.print("What is the euro price? ");
		euroPrice = sc.nextDouble();
		System.out.print("How many euros will be spent? ");
		spentEuros = sc.nextDouble();
		
		result = EuroConverter.euroToReal(euroPrice, spentEuros);
		
		System.out.printf("Amount to be paid = %.2f", result);
		
		sc.close();

	}

}
