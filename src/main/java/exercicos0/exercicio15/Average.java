package exercicos0.exercicio15;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        do {
            System.out.print("Digite um número: ");
            double number = scanner.nextDouble();
            sum += number;
            count++;
        } while (count < 50);
        double average = sum / 50;
        System.out.println("A média aritmética dos números é: " + average);
    }
}
