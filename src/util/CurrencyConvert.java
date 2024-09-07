package util;

public class CurrencyConvert {

	public static double total(double valor, double quantidade) {
		return ((valor*quantidade)*0.06) + valor*quantidade;
	}
}
