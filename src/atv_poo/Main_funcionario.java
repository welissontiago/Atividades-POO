package atv_poo;

import java.util.Scanner;

import Entites.Employee;

public class Main_funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		employee.Name = sc.next();
		System.out.println("Qual o seu Salario Bruto? ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Quanto de imposto você paga ?");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.println("Em quantos % seu salario vai aumenta esse mês? ");
		int porcentagem = sc.nextInt();
		employee.increaseSalary(porcentagem);
		
		System.out.println(employee);
		sc.close();
	}

}
