//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de A, B e C:");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double triangulo = (A * C) / 2.0;
        double circulo = 3.14159 * C * C;
        double trapezio = ((A + B) * C) / 2.0;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.println("TRIANGULO: " + String.format("%.3f", triangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", circulo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", quadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", retangulo));

        scanner.close();
    }
}
