package condicoes;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*      Pedimos ao console que pergunta o horário ao leitor e
        armazena o valor digitado à variável 'hora'
*/
        System.out.println("Quantas horas?");
        int hora = sc.nextInt();

/*      Se a variável 'hora' for menor que 12 "Bom dia"
        Senão, se a variável 'hora' for menor que 18 "Boa tarde"
        Senão "Boa noite".
*/
        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 17) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        sc.close(); // É uma boa prática fechar o scanner fora do bloco else
    }
}