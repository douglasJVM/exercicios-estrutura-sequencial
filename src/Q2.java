
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio, area;
        final double PI = 3.14159;

        System.out.print("Digite o valor do raio: ");
        raio = sc.nextDouble();

        area = PI * raio * raio;

        System.out.printf("A área do círculo é: %.4f%n", area);

        sc.close(); 
    }
}
