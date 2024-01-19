package If;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variável
        double hora = sc.nextDouble();

        //Se a hora for menor que 12, execute o Sysout "Bom dia".
        if (hora < 12) {
            System.out.println("Bom dia!");

        // Se não hora for maior que 12, execute o Sysout "Boa tarde".
        } else {
            System.out.println("Boa tarde!");

            sc.close();
        }
    }
}
