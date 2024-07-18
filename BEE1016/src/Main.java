import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Y = sc.nextInt();
		
		int minutos = Y * 2;
		
		System.out.println(minutos + " minutos");
		
		sc.close();
	}
}