package If.operacaoComulativa;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Texto de entrada
        System.out.println("Digite a quantidade de minutos consumidos: ");
        int minuto = sc.nextInt();

        double conta = 50.0;

        /* Se os minutos forem maior a 100, então conta vale o valor base da conta + a
        quantidade de minutos utilizados -100 multiplicando o resultado por 2*/
        if(minuto > 100) {
            conta += (minuto - 100) * 2.0;
        }
        // imprimir o total com duas casas decimais após o ponto.
        System.out.printf("Valor é R$ %.2f%n", conta);
    }
}
