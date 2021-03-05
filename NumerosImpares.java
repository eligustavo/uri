package exercicios.desafios.uri;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int aux, impar = 0;

        aux = A;

        while (impar != 6) {
            if (aux % 2 != 0) {
                impar = impar + 1;
                System.out.println(aux);
            }
            aux = aux + 1;
        }
        sc.close();
    }
}