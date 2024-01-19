package If;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();

        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Olá senhor " + nome + ". O senhor irá servir ao exército.");

        } else {
            System.out.println("Olá senhor " + nome + ". O senhor não irá servir ao exército.");
        }
    }
}
