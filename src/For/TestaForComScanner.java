package For;

import java.util.Scanner;

public class TestaForComScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDiarias = 22;

        System.out.println("Quantos dias você trabalhou?");

        int diasTrabalhados = sc.nextInt();
        double total = 0;

        for (int i = 0; i < diasTrabalhados; i++) {
            total = 250 * diasTrabalhados;
        }

        System.out.println("---------------------------------");
        System.out.println("Você receberá $" + total + " Reais por trabalhar " + diasTrabalhados + " dias.");
    }
}