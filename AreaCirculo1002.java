package exercicios.desafios.uri;

import java.util.Scanner;

public class AreaCirculo1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * raio * raio;
        System.out.format("A=%.4f%n", area);

        sc.close();
    }
}