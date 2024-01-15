package estruturaCondicional.Exercicios;

import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Titulo de entrada do programa*/
        System.out.println("DIGITE A SENHA!");
        // Declaração da variável 'senha', do tipo 'int' que recebe dados de entrada;
        int senha = sc.nextInt();
        // Declaração da variável 'correta' do tipo 'int' que possui o valor 2002.
        int correta = 2002;

        /* Enquanto a variável 'senha' possuir um valor diferente da variável 'correta'
        * apresentará a maneságem negativa. Caso contrário, apresentará a mensagem
        * de positiva.*/
        while (senha != correta) {
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }
        // Titulo da mensagem quando for negativa.
        System.out.println("-----------------");
        System.out.println("ACESSO PERMITIDO!");
        sc.close();
    }
}
