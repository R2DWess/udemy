package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um valor: ");
        double val = sc.nextDouble();

        if (val < 0.0 || val > 100.0) {
            System.out.println("Fora de intervalo");

        } else if (val <= 25.00) {
            System.out.println("Intevalo [0,25]");

        } else if (val <= 50.0) {
            System.out.println("Intervalo [25,50]");

        } else if (val <= 100.00) {
            System.out.println("Intevalo [75,100]");
        }
    }
}
