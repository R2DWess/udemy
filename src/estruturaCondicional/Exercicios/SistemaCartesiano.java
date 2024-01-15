package estruturaCondicional.Exercicios;

import java.util.Scanner;

public class SistemaCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis x, y do tipo 'int' que receberá dados de entrada.
        int x = sc.nextInt();
        int y = sc.nextInt();

        /* Enquanto 'x' for diferente de 0 E 'y' for diferente de 0
        * execute o comando: Se 'x' for maior que 0 E y for maior que 0
        * Imprima a manesagem "primeiro".
        * Se não, se 'x' for menor que 0 E 'y' for maior que 0
        * Imprima a mensagem "segundo"
        * Se não, se 'x' for maior que 0 E 'y' for menor que 0
        * Imprima a mensagem "terceiro
        * Se não...
        * Imprima a mansagem "quarto"*/

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
