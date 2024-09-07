package Entites;

public class Bank {

	private int number;
	private String name;
	private double initial_Deposit;

	public Bank(int number, String name, double initial_Deposit) {
		super();
		this.number = number;
		this.name = name;
		this.initial_Deposit = initial_Deposit;
	}

	public Bank(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitial_Deposit() {
		return initial_Deposit;
	}

	public double deposit(double amount) {
		return initial_Deposit += amount;
	}

	public double withdrawal(double withdraw) {
	    if (initial_Deposit >= withdraw + 5) { 
	        initial_Deposit -= (withdraw + 5);  
	        return initial_Deposit;
	    } else {
	        throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
	    }
	}
	
	public String toString() {
		return "Nome do cliente: " + name + " numero da conta : " + number + " Valor total da conta: " + initial_Deposit;
	}
}
