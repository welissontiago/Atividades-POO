package atv_poo;

import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos numero que digitar");
		int n = sc.nextInt();
		int[] numero = new int[n];
		
		
		for (int i=0; i<n;i++) {
			System.out.println("Digite um numero: ");
			numero[i] = sc.nextInt();
		}
		
		int soma = 0;
		for(int i=0; i<n;i++) {
			soma  += numero[i];
		}
		
		int media = soma/n;
		
		System.out.println("valores: ");
		
		for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", numero[i]);
	    }
		
		System.out.println("A soma é : " + soma + " A media é : " + media);
		
		
		sc.close();

	}

}
