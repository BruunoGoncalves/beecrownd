import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notasCem, notas50, notas20, notas10, notas5, notas2, notas1, resto;
		
		int valor = sc.nextInt();
		
		notasCem = valor / 100;
		resto = valor % 100;
		
		notas50 = resto / 50;
		resto = resto % 50;
		
		notas20 = resto / 20;
		resto = resto % 20;
		
		notas10 = resto / 10;
		resto = resto % 10;
		
		notas5 = resto / 5;
		resto = resto % 5;
		
		notas2 = resto / 2;
		resto = resto % 2;
		
		notas1 = resto;
		
		System.out.println(valor);
		System.out.println(notasCem + " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");
		
		sc.close();
	}
}
