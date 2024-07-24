import java.util.Scanner;

/**
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int dias = sc.nextInt();
		
		int ano = dias / 365;
		int resto = dias % 365;
		
		int mes = resto / 30;
		
		int dia = resto % 30;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();
	}
}
