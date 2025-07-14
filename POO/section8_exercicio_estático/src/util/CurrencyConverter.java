package util;

public class CurrencyConverter {
	
	public static double iof = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + iof);
	}
}
