import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double ganho;
		int porcento;
		
		if (salario >= 0 && salario <= 400.0) {
			ganho = salario * 0.15;
			salario += ganho;
			porcento = 15;
		} else if (salario >= 400.01 && salario <= 800.00) {
			ganho = salario * 0.12;
			salario += ganho;
			porcento = 12;
		} else if (salario >= 800.01 && salario <= 1200.00) {
			ganho = salario * 0.10;
			salario += ganho;
			porcento = 10;
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			ganho = salario * 0.07;
			salario += ganho;
			porcento = 7;
		} else {
			ganho = salario * 0.04;
			salario += ganho;
			porcento = 4;
		}
		
		System.out.printf("Novo salario: %.2f%n", salario);
		System.out.printf("Reajsute ganho: %.2f%n", ganho);
		System.out.println("Em percentual: " + porcento + " %");
		
		sc.close();
	}
}
