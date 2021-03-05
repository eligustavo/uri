package exercicios.desafios.uri;

import java.util.Scanner;

public class SeisNumerosImpares1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = sc.nextInt();

        for (int i = 1; i <= 6; i++) {
            if (contador % 2 != 0) {
                contador += 1;
            }
        }
        System.out.println(contador);
    }
}