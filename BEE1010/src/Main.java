import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		sc.nextInt();
		int nPec1 = sc.nextInt();
		double valorPec1 = sc.nextDouble();
		
		sc.nextInt();
		int nPec2 = sc.nextInt();
		double valorPec2 = sc.nextDouble();
		
		double valorTotal = (nPec1 * valorPec1) + (nPec2 * valorPec2);
		
		System.out.printf("VALoR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();
	}
}