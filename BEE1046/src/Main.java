import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int duracao;
		
		if (A < B) {
			duracao = A - B;
		} else {
			duracao = 24 - A + B;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
	}
}
