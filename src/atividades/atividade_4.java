package atividades;

import java.util.Scanner;

public class atividade_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o eixo X e o eixo Y que você deseja saber o quadrante: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 || y != 0) {
			
			if ((x > 0) && (y > 0)){
				System.out.println("Primeiro Quadrante (QI)");
			}
			else if ((x < 0) && (y > 0)){
				System.out.println("Segundo Quadrante (QII)");
			}
			else if ((x < 0) && (y < 0)) {
				System.out.println("Terceiro Quadrante (QIII)");
			}
			else if ((x > 0 && y < 0)) {
				System.out.println("Quarto Quadrante (QIV)");
			}
			
			System.out.println("Digite o eixo X e o eixo Y que você deseja saber o quadrante: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
		}

	}

}
