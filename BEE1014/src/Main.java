import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int disTotal = sc.nextInt();
		double combGasto = sc.nextDouble();
		
		double totalGasto = disTotal / combGasto;
		
		System.out.printf("%.3f km/l%n", totalGasto);
		
		sc.close();
	}
}