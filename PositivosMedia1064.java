package exercicios.desafios.uri;

import java.util.Locale;
import java.util.Scanner;

public class PositivosMedia1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int c = 0;
        double a = 0;

        for (int i = 0; i < 6; i++) {
            double num = sc.nextDouble();
            if (num > 0) {
                c = c + 1;
                a = a + num;
            }
        }
        System.out.println(c + " Valores positivos");
        System.out.printf("%.1f\n", (a / c));
        sc.close();
    }
}