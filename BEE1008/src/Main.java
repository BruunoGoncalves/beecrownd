import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nFun = sc.nextInt();
		int hTrab = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = valorHora * hTrab;
		
		System.out.println("NUMBER = " + nFun);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}