package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
/*      Se a variável 'numero' for o resto da divisão por 2 for igual a 0
        imprimos "Par"
        Senão,imprimimos "Impar"
*/
        if (numero % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
