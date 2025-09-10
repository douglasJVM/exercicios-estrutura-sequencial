//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nf, hrst;
        double hrspaga, salario;

        System.out.print("Digite o seu número: ");
        nf = sc.nextInt();

        System.out.print("Digite as horas trabalhadas: ");
        hrst = sc.nextInt();

        System.out.print("Digite o valor recebido por hora: ");
        hrspaga = sc.nextDouble(); // <- Correção aqui

        salario = hrst * hrspaga;

        // Imprimir com 2 casas decimais
        System.out.printf("Número: %d%n", nf);
        System.out.printf("Salário: R$ %.2f%n", salario);

        sc.close();
    }
}
