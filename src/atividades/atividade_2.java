package atividades;

import java.util.Scanner;

public class atividade_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("O numero que você digitou é negativo");
		}
		
		else if (numero > 0){
			System.out.println("O numero que você digitou é positvo");
		}
		
		else {
			System.out.println("O numero que você digitou é zero ou não é um numero valido");
		}

	}

}
