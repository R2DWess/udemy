package estruturaCondicional.Exercicios;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        // Inicialização do do comando de entrada de dados
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis alcool, gasolina e diesel, do tipo double, com valor 0 atribuido.
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        // Declração da variável 'tipo' do tipo 'int' que está aguardando a entrada de dados.
        int tipo = sc.nextInt();

        /* Enquanto a variável 'tipo' for diferente de 4, execute:
        * Se a variável 'tipo' for igual a '1', execute: a variável
        * calculo vale ela mesma (alcool) + 1.
        * Se não, se a variável 'tipo' for igual a 2, execute: a variável
        * gasolina vale ela mesma + 1.
        * Se não, se a variável 'tipo' for igual a 3, execute: a variável
        * diesel vale ela mesma + 1.*/
        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            }
            else if (tipo == 3) {
                diesel = diesel + 1;
            }

            tipo = sc.nextInt();
        }
        /* Impressão da mensagem de agradecimal, seguida da demosntração
        * dos combustiveis mais utilizados, pedindo o nome do combustivel
        * correspondente e concatenando com o valor a ele atribuido nas
        * somas anteriores.*/

        System.out.println("--------------");
        System.out.println("MUITO OBRIGADO");
        System.out.println("--------------");
        System.out.println("O total de uso para cada combustível é: ");
        System.out.println("O Alcool, utilizado: " + alcool + " vezes");
        System.out.println("O Gasolina, utilizado: " + gasolina + " vezes");
        System.out.println("O Diesel, utilizado: " + diesel + " vezes");

        sc.close();
    }
}