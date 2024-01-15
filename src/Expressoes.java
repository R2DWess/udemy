import java.util.Scanner;

public class Expressoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Comando de saída de dados
        System.out.println("Digite um valor: ");
        // Declaração da vairável 'valor' do tipo 'double que receberá uma entrada de dados
        double valor = sc.nextDouble();
        /* A variável 'desconto' possui o seguinte calculo:
        *  Se a variável 'valor' possuir um valor atribuido a ela que seja menor que 34.5
        *  Logo não haverá desconto. No entanto, caso contrário, o desconto será de 0.5*/
        double desconto = (valor < 34.5) ? valor * 0.1 : valor * 0.5;

        // Comando de saída de dados concatenado a variável 'desconto'.
        System.out.println("O desconto é: " + desconto);
        System.out.println("E o valor é ");
    }
}
