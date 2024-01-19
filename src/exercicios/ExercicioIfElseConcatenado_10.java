package exercicios;

import java.util.Scanner;

public class ExercicioIfElseConcatenado_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial: ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora Final: ");
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo teve duracao de " + duracao + " horas");
    }
}
