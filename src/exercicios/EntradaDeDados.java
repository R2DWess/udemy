package exercicios;

import java.util.Locale;

public class EntradaDeDados {
    public static void main(String[] args) {
        // Declaração de variáveis
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        // Impressão dos produtos
        System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n", product1, price1, product2, price2);

        // Impressão dos registros
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);

        
        // Impressão da medida com oito casas decimais
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);

        // Arredondamento para três casas decimais
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);

        // Separador de milhares e decimais conforme padrão dos EUA
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}