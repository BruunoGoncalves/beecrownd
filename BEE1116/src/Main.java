import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double resultado = 0;
            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                resultado = a / b;
                System.out.printf("%.1f%n", resultado);
            }

        }

        sc.nextLine();
    }
}