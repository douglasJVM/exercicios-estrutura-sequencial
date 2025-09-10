//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da peça 1:");
        int cod1 = scanner.nextInt();

        System.out.println("Digite a quantidade da peça 1:");
        int qtd1 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peça 1:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o código da peça 2:");
        int cod2 = scanner.nextInt();

        System.out.println("Digite a quantidade da peça 2:");
        int qtd2 = scanner.nextInt();

        System.out.println("Digite o valor unitário da peça 2:");
        double valor2 = scanner.nextDouble();

        double total = (qtd1 * valor1) + (qtd2 * valor2);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

        scanner.close();
    }
}
