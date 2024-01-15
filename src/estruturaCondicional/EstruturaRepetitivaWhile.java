package estruturaCondicional;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declaração da variável 'x', do tipo 'int' que receberá entrada de dados.
        System.out.println("Digite os valores desejados para a soma");
        int x = sc.nextInt();

        // Declaração da variável 'soma', do tipo 'int' que possuir valor 0.
        int soma = 0;

        /* Enquanto 'x' for diferente de 0, a variável 'soma' irá valer soma + o valor
          atribuido a 'x'. */
        while (x != 0) {
            soma = soma + x;
            x = sc.nextInt();
        }
        // Impressão do valor da variável 'soma'
        System.out.println("---------------------------------------");
        System.out.println("A soma dos valores digitados é: " + soma);
    }
}
