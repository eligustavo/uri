package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A;
        int total = 0;

        for (int i = 0; i < 6; i++) {
            A = sc.nextDouble();

            if (A > 0) {
                total++;
            }
        }
        System.out.print(total + " valores positivos\n");

        sc.close();
    }
}