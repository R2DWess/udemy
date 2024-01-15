package operacaoComulativa;

import java.util.Scanner;

public class DiaSemanaIf {
    public static void main(String[] args) {

        /* Comando utilizado para usar o 'Scanner'. Isso possibilita que
        possamos atribuir valores à variáveis usando o telcado*/
        Scanner sc = new Scanner(System.in);

        /* Aqui usamos o comando de 'print' para que seja trago uma mensagem
        desejada quando o programa se iniciar.*/
        System.out.println("Digite um dia da semana");

        /* Aqui, atribuimos a variável x, do tipo int, a entrada de dados do tipo
         inteiro, quando usado o teclado.*/
        int x = sc.nextInt();

        // Se a variável 'x' for igual a '1', imprima "Domingo"
        if (x == 1) {
            System.out.println("O dia da semana é: Domingo");

       /* Senão, se a variável 'x' for igual a '1', imprima
        "Segunda"*/
        } else if (x == 2) {
            System.out.println("O dia da semana é: Segunda");

        /* Senão, se a variável 'x' for igual a '1', imprima
        "Terça"*/
        } else if (x == 3) {
            System.out.println("O dia da semana é: Terça");

        /* Senão, se a variável 'x' for igual a '1', imprima
        "Quarta"*/
        } else if (x == 4) {
            System.out.println("O dia da semana é: Quarta");

        /* Senão, se a variável 'x' for igual a '1', imprima
        "Quinta"*/
        } else if (x == 5) {
            System.out.println("O dia da semana é: Quinta");

        /* Senão, se a variável 'x' for igual a '1', imprima
        "Sexta"*/
        } else if (x == 6) {
            System.out.println("O dia da semana é: Sexta");

        /* Senão, se a variável 'x' for igual a '1', imprima
        "Sábado"*/
        } else if (x == 7) {
            System.out.println("O dia da semana é: Sábado");
        }
        sc.close();
    }
}