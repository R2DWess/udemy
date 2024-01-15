package estruturaCondicional;

import java.util.Scanner;

public class EscopoInicializacao {
    public static void main(String[] args) {
        // Inicialização do comando de entrada de dados
        Scanner sc = new Scanner(System.in);

        double price = 400.00;
        // Declaração da variável 'x' que possui o valor 0 atribuido a ela.
        double desconto = 0;

        // Se 'x' for menor que 2, imprima 'x'
        if (price < 200.00) {
            desconto = price * 0.1;

        } else {
            desconto = 0;
        }
    }
}

/* Ponto de observação!
* Quando um comando está fora do escopo do projeto, e está tentanto utilizar uma variável
* declarada dentro. Deve-se inicializar a variável, para que assim o comando de fora possa
* utilizala*/