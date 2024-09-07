package atv_poo;

import java.util.Scanner;

import util.CurrencyConvert;

public class cambio {

	public static void main(String[] args) {
		
		CurrencyConvert currency = new CurrencyConvert();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do dolar");
		double valor = sc.nextDouble();
		System.out.println("Digite a quantidade que deseja comprar: ");
		double quantidade = sc.nextDouble();
		
		System.out.println(currency.total(valor, quantidade));
		
		sc.close();
	}

}
