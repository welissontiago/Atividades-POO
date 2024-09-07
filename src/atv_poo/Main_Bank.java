package atv_poo;

import java.util.Scanner;

import Entites.Bank;

public class Main_Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank(54321, "Uelisson", 1000);
		int operacao;

		do {
			System.out.println("Qual operação gostaria de realizar? ");
			System.out.println(" 1 - Sacar 2 - depositar 3 - sair: ");
			operacao = sc.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("Qual valor gostaria de sacar ? ");
				double valor = sc.nextDouble();
				bank.setName("Uelisson Tiago");
				bank.withdrawal(valor);
				System.out.println(bank);
				
				break;
			case 2:
				System.out.println("Quanto gostaria de depositar ? ");
				valor = sc.nextDouble();
				bank.deposit(valor);
				System.out.println(bank);
				break;
			case 3:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Digite um valor valido");
				break;
			}
		} while (operacao != 3);
		
		sc.close();
	}
}
