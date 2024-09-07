package atv_poo;

import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		double alturaTotal, alturaMedia, porcentagem;
		
		System.out.println("Quantas pessoas serão digitadas: ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double [n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Qual o nome: ");
			nome[i] = sc.next();
			sc.nextLine();
			System.out.println("Qual a sua idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
			System.out.println("Qual a sua altura ?");
			altura[i] = sc.nextDouble();
		}
		
		alturaTotal = 0;
		int numeroMenores = 0;
		for (int i=0; i<n; i++) {
			if (idade[i] <= 16) {
				numeroMenores++;
			}
			alturaTotal +=  altura[i];
		}
		
		alturaMedia = alturaTotal/n;
		porcentagem = ((double)numeroMenores / n) * 100.0;
		
		System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
		
		for(int i=0; i<n; i++) {
			if(idade[i] <= 16) {
				System.out.println("O nome do menor é: " + nome[i]);
			}
		}
		
		
		sc.close();

	}

}
