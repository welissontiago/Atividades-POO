package atv_poo;

import java.util.Scanner;

import Entites.Rectangle;

public class Ex_retangulo {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a altura do Retangulo? ");
		rectangle.height = sc.nextDouble();
		System.out.println("Qual a larguta do retangulo? ");
		rectangle.width = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
	}

}
