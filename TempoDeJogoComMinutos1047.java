package exercicios.desafios.uri;

import java.util.Scanner;

public class TempoDeJogoComMinutos1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int minInicial = sc.nextInt();
        int totalMinInicial = horaInicial * 60 + minInicial;

        int horaFinal = sc.nextInt();
        int minFinal = sc.nextInt();
        int totalMinFinal = horaFinal * 60 + minFinal;

        int minDif = (24 * 60 - totalMinInicial) + totalMinFinal;

        int horas = minDif / 60;
        int minutos = minDif % 60;

        if (horas >= 24 && minutos >= 1) {
            horas = horas % 24;
        }
        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);
      
        sc.close();
    }

}