package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        /* Aqui, delcaramos as variaveis das peças 01*/
        int peca01 = sc.nextInt();
        int numeroPecas01 = sc.nextInt();
        double valorUniPeca01 = sc.nextDouble();

        /* Aqui, delcaramos as variaveis das peças 02*/
        int peca02 = sc.nextInt();
        int numeroPecas02 = sc.nextInt();
        double valorUniPeca02 = sc.nextDouble();

        /*Valor da peça01 X Numero de peças01 + Valor da peça02 X Numero de peças02*/
        double total = valorUniPeca01 * numeroPecas01 + valorUniPeca02 * numeroPecas02;

        /*Mensagem " Valor a pagar:" + separador de casas decimáis concatenando o total do calculo*/
        System.out.printf(" Valor a pagar: R$ %.2f%n", total);

        /*Fechando comando Scanner*/
        sc.close();
    }
}
