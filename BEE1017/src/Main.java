import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tempoGasto = sc.nextDouble();
		double velMedia = sc.nextDouble();
		
		double litrosTotal = (velMedia / 12) * tempoGasto;
		
		System.out.printf("%.3f%n", litrosTotal);
		
		sc.close();
	}
}