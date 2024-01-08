package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Variáveis de entrada
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        //Variáveis simples
        double triangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;

        //Declaração de valores
        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A * B) * 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;


        //Impressão de comandos
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
