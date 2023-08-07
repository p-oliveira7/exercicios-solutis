package exercicios0.exercicio07;

import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = sc.nextInt();

        // Troca os valores de A e B
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valores trocados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
    }
}
