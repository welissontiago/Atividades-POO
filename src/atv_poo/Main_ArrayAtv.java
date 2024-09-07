package atv_poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entites.arrayAtv;

public class Main_ArrayAtv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<arrayAtv> list = new ArrayList<>();

        System.out.println("Quantos funcionarios você gostaria de registrar? ");
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.println("Qual o id ?");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Qual o nome?");
            String name = sc.nextLine(); 
            System.out.println("Qual o salario?");
            double salary = sc.nextDouble();
            arrayAtv atv = new arrayAtv(id, name, salary);
            list.add(atv);
        }

        System.out.println("Digite o id do funcionario que você gostaria de aumentar o salario: ");
        int id2 = sc.nextInt();
        Integer pos = position(list, id2);

        if (pos == null) {
            System.out.println("Id invalido");
        } else {
            System.out.println("Digite o percentual que deseja aumentar desse funcionario: ");
            double percentual = sc.nextDouble();
            list.get(pos).increaseSalary(percentual);
        }

        
        for (arrayAtv emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<arrayAtv> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i; 
            }
        }
        return null; 
    }
}
