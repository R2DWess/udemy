package If;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variáveis
        double salario = sc.nextDouble();
        double tempoTrabalhado = sc.nextDouble();

        /*Se o seu salário for menor ou igual a 1400 OU seu tempo de trabalho for menor ou igual a 3
    ,você tem direito a receber beneficios*/
        if (salario <= 1.400 || tempoTrabalhado <= 3){
            System.out.println("Você tem direito a beneficios");

            /*Se não, você não possui direitos a beneficios*/
        } else {
            System.out.println("Você não tem direitos a benefícios");
        }
    }
}
