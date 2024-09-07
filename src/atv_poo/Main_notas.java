package atv_poo;

import java.util.Scanner;

import Entites.Notas;

public class Main_notas {

	public static void main(String[] args) {
		
		Notas notas = new Notas();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual seu nome? : ");
		notas.Nome = sc.next();
		System.out.println("Digite a nota dos três semestres: ");
		notas.nota1 = sc.nextDouble();
		notas.nota2 = sc.nextDouble();
		notas.nota3 = sc.nextDouble();
		
		System.out.println(notas);
		
		sc.close();
	}

}
