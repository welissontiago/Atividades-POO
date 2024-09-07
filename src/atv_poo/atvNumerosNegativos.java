package atv_poo;

import java.util.Scanner;

public class atvNumerosNegativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos numeros gostaria de digitar?");
		int n = sc.nextInt();
		int[] numero = new int[n];

		if (n <= 10 && n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.println("Qual numero gostaria de digitar: ");
				numero[i] = sc.nextInt();
			}
		}else {
			System.out.println("Quantida de numeros invalidas");
		}
		
		for (int i = 0; i<= n; i++) {
			if(numero[i] < 0) {
				System.out.println("Os numeros negativos são: " + numero[i]);
			}
		}
		
		
		sc.close();

	}

}
