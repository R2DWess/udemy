package calculosGeometricos;

import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DE TRAPÉZIO");

        double D = scanner.nextDouble();
        double d = scanner.nextDouble();
        double area = D * d;


        System.out.println(area);


    }
}
