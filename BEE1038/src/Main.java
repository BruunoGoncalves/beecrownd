import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		double qtd = sc.nextDouble();
		
		double total;
		
		switch (codigo) {
			case 1:
				total = qtd * 4.0;
				System.out.printf("Total: R$ %.2f%n", total);
				break;
			case 2:
				total = qtd * 4.5;
				System.out.printf("Total: R$ %.2f%n", total);
				break;
			case 3:
				total = qtd * 5.0;
				System.out.printf("Total: R$ %.2f%n", total);
				break;
			case 4:
				total = qtd * 2.0;
				System.out.printf("Total: R$ %.2f%n", total);
				break;
			case 5:
				total = qtd * 1.5;
				System.out.printf("Total: R$ %.2f%n", total);
				break;
			default:
				System.out.println("Item não encontrado! Digite um item válido.");
		}
		
		sc.close();
	}
}
