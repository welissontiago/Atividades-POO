package atividades;

import java.util.Scanner;

public class atividade_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite uma senha: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha incorreta Digite novamente a senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Parabens a senha está correta!");

	}

}
