package exercicos0.exercicio11;

import java.util.Scanner;

public class NomeProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = sc.nextInt();

        if (codigo == 001) {
            System.out.println("Parafuso");
        } else if (codigo == 002) {
            System.out.println("Porca");
        } else if (codigo == 003) {
            System.out.println("Prego");
        } else {
            System.out.println("Diversos");
        }
    }
    /* public static void main(String[] args) {
        Map<Integer, String> produtos = new HashMap<>();
        produtos.put(001, "Parafuso");
        produtos.put(002, "Porca");
        produtos.put(003, "Prego");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = sc.nextInt();

        String nomeProduto = produtos.getOrDefault(codigo, "Diversos");
        System.out.println(nomeProduto);
    }*/
}

