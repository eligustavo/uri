package exercicios.desafios.uri;

import java.util.Scanner;

public class SomaSimples1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
   
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("X = " + (a + b));

        sc.close();
    }
}