package operacaoComulativa;

import java.util.Scanner;

public class SegundoExemplo {
    public static void main(String[] args) {

        // Comando para aceitar entrada de dados
        Scanner sc = new Scanner(System.in);
        // Comando para impressão de texto
        System.out.println("Quantos dias trabalhou?");
        //Declaração de variável do tipo 'double' que recebe entrada de dados do tipo 'double'
        double diasTrabalhados = sc.nextDouble();
        // Declaração de variável do tipo 'double' que está atribuido a '290'.
        double valorDiaria = 290;
        // Declaração da variável 'receber' do tipo double.
        double receber;

        /* Se a variável 'diasTrabalhados' possuir um valor igual a 22*/
        if (diasTrabalhados == 22) {
            /* A variável 'receber' será igual a 'diasTrabalhados x valorDiaria*/
            receber = diasTrabalhados * valorDiaria;
            /* Comando de saída de dados que trás uma mensagem desejada + o valor atribuido
             a variável 'receber'*/
            System.out.println("Seu salário é : " + receber);

        }
    }
}
