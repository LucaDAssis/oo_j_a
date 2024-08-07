package application;

import entities.Produto;

import java.util.Scanner;

public class ProgramProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] produtos = new Produto[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }

        double total = 0;
        for (int i = 0; i < n; i++) {
            total += produtos[i].getPreco();
        }
        double media = total / n;

        System.out.printf("Averge Prrice  = %.2f%n", media);



        sc.close();
    }
}
