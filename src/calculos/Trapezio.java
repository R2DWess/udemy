package calculos;

import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double B = scanner.nextDouble();
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        double area = (B + b) * h / 2;

        System.out.println(area);
    }
}
