package application;

import java.util.Scanner;

public class ProgramMediaAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = scanner.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = scanner.next();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
            System.out.print("Altura: ");
            altura[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + altura[i];
        }
        double media = soma / n;
        System.out.printf("Altura média: %.2f%n" , media);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                count = count + 1;
            }
        }
        double media2 = count * 100 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , media2);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.println(nome[i]);
            }
        }






        scanner.close();
    }
}
