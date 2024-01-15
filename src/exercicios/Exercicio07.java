package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");

        }
    }
}
