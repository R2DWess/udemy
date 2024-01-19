package For;

public class TestaForSozinho {
    public static void main(String[] args) {

        int totalDiarias = 22;
        int diasTrabalhados;
        double valorDiaria;
        double total = 0;

        for ( diasTrabalhados = 0;  diasTrabalhados<totalDiarias; diasTrabalhados ++) {
            total = diasTrabalhados * 250 + 250;
            System.out.println("Você trabalhou " + diasTrabalhados + " dias. Ainda não pode receber " + total);

        }
        System.out.println("---------------------------------");
        System.out.println("Parabéns! Seu salário é: " + total + " Por ter trabalhado " + diasTrabalhados + " dias");
    }
}
