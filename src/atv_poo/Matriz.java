package atv_poo;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas: ");
		int n = sc.nextInt();
		System.out.println("Digite o numero de colunas: ");
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println("digite o numero da linha: " + i + " coluna: " + j);
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite um numero que pertença a matriz: ");
		int matrizNum = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrizNum == mat[i][j]) {
					System.out.println("Posição linha: " + i + " Coluna: " + j);
					if (j > 0) {
						System.out.println("esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("cima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Baixo: " + mat[i+1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
