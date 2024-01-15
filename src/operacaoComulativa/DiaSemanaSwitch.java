package operacaoComulativa;

import java.util.Scanner;

public class DiaSemanaSwitch {
    public static void main(String[] args) {
        // Usando o comando Scanner para ler entrada de dados
        Scanner sc = new Scanner(System.in);

        // Declarando a vairável 'x' do tipo 'int' que irá receber os dados digitados.
        int x = sc.nextInt();

        /*Comando utilizado para dizer que a vairável dia do tipo 'String' irá receber
         os valores de 'x' e caso algum desses valores sejam número de 1 a 7, será
         impresso um texto com o dia da semana correspondente*/
        String dia = switch (x) {
            case 1 -> "domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            // Caso contrário, será impresso uma mensagem de "valor inválido".
            default -> "Valor invalido";
        };

        /* Usamos esse comando para imprimir o dia da semana correspondente ao que a variável dia
        trará*/
        System.out.println("O dia é: " + dia);
        sc.close();
    }
}
