//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa.


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double n1, n2,soma;



        System.out.println("Digire um Número");
        n1 = sc.nextDouble();

        System.out.println("Digire um Número");
        n2 = sc.nextDouble();

        soma = n1 + n2;

        System.out.printf("O resultado é " + soma);
    
        sc.close();
    }
}
