package atv_poo;

import java.util.Scanner;

public class numeros_pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n;
		
		System.out.println("Quantos numeros você quer digitar? ");
		n = sc.nextInt();
		int[] pares = new int[n];
		
		
		int cont = 0;
		for(int i=0; i<n; i++) {
			System.out.println("Qual numero gostaria de digitar? ");
			pares[i] = sc.nextInt();
		}
		
		for (int i=0; i<n;i++) {
			if (pares[i]%2 == 0) {
				System.out.println("Os numeros são: "+ pares[i]);
				cont++;
			}
		}
		
		System.out.println("A quantidade de numero pares é: " + cont++);
		
		sc.close();

	}

}
