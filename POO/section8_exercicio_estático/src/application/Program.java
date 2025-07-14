package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice, amount, result; 
		
		System.out.print("What is the dollar price? ");
		dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		amount = sc.nextDouble();
		result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f", result);
		
		sc.close();
	}
}
