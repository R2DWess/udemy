package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);



        double r = sc.nextDouble();
        double area = Math.PI * r * r;

        System.out.printf(Locale.US, "%.4f", area);
    }
}
