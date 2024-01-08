package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor01 = sc.nextInt();
        int valor02 = sc.nextInt();
        int resultado = valor01 + valor02;
        System.out.println("A soma do valor digitado é: " + resultado);
    }
}
