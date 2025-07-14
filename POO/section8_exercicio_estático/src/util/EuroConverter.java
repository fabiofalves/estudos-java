package util;

public class EuroConverter {
	
	public static double iof = 0.04;
	
	public static double euroToReal(double euroPrice, double spentEuros) {
		return euroPrice * spentEuros * (1.0 + iof);
	}
}
