package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

//        Se o Eixo 'X' for igual a '0.0' e o Eixo 'Y' também for igual a '0.0' = "Origem"
        if(x == 0.0 && y == 0.0) {
            System.out.println("Origem");

//        Senão, se o Eixo 'X' for igual a '0.0' = "Eixo X"
        } else if (x == 0.0) {
            System.out.println("Eito Y");

//        Senão, se o Eixo 'Y' for igual a 0.0 = "Eixo Y"
        } else if (y == 0.0) {
            System.out.println("Eixo X");

//        Senão, se o Eixo 'X' for maior que 0.0 e o Eixo 'Y' também = "Q1"
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");

//        Senão, se o Eixo 'X' for menor que 0.0 e o Eixo 'Y' for maior = "Q2"
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");

//        Senão, se o Eixo 'X' for menor que 0.0 e o Eixo 'Y' também = "Q3"
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
//        Senão = "Q4"
        else {
            System.out.println("Q4");
        }
        sc.close();
    }
}
