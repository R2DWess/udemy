package estruturaCondicional;

import java.util.Scanner;

public class TesteDeMesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variável 'x' do tipo 'double' possui o valor de 100
        double x = 100;
        // variável 'y' do tipo 'double' possui o valor de 100
        double y = 100;

        // enquanto 'x' for diferente de 100
        while (x != 100){
            // Impressão de texto
            System.out.println("Olha");
            x = Math.sqrt(y);
        }
    }
}
