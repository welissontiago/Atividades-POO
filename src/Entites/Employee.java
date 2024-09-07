package Entites;

public class Employee {
	
	public String Name;
	public double GrossSalary;
	public double tax;
	
	public double netSalary() {
		return GrossSalary - tax;
	}
	
	public void increaseSalary(double porcentage) {
		GrossSalary += (GrossSalary*porcentage)/100;
	}

	public String toString() {
		return "Funcionario " + Name + ", $" + netSalary();
	}
}
