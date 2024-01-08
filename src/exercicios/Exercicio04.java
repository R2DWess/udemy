package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numeroFuncionario = sc.nextInt();
        double horasTrabalhadas = sc.nextDouble();
        double valorHora = sc.nextDouble();
        double recebe = horasTrabalhadas * valorHora;

        System.out.printf("NUMBER = %d%n" + "SALARY = U$ %.2f",
                numeroFuncionario, recebe);

        sc.close();
    }
}
