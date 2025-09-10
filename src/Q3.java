//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A,B,C,D;
        int dif;
        

        System.out.print("Digite o Primeiro valor: ");
        A = sc.nextInt();

       System.out.print("Digite o Segundo valor:");
        B = sc.nextInt();

        System.out.print("Digite o Terceiro valor: ");
        C = sc.nextInt();

        System.out.print("Digite o Quarto valor:");
        D = sc.nextInt();

        dif = (A * B) - (C * D);

        System.out.printf("A Diferença é " + dif);

        sc.close(); 
    }
}
