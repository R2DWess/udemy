package calculosGeometricos;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DE BASE");

        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double area = base * altura;

        System.out.println(area);
    }
}
