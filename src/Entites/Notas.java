package Entites;

public class Notas {
	
	public String Nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		if((nota1 <= 30) && (nota2 <= 35) && (nota3 <= 35)) {
			
		}
		else {
			System.out.println("Porfavor digite numeros validos. ");
		}
		return nota1+nota2+nota3;
	}
	
	public String pass() {
	    if (notaFinal() >= 60) {
	        return "Aprovado";
	    } else {
	        double faltou = 60 - notaFinal();
	        return "Reprovado, faltou " + faltou + " pontos para passar";
	    }
	}
	
	public String toString() {
		return "Aluno: " + Nome + " | Nota: " + notaFinal() + " | Situação: " + pass();
	}
}
