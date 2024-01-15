package calculos;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        double area = b * h;

        System.out.println(area);
    }
}
