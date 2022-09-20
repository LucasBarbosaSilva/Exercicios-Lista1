package exercise1;

public class CurrencyConverter {
	public static double dollarToReal(double amount, double dollarPrice) {
		double result = (amount * dollarPrice)*1.06;
		return result;
	}
}



