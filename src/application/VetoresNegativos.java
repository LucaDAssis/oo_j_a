package application;

import java.util.Scanner;

public class VetoresNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Quaal o Valor da Matrix??");
        int n = sc.nextInt();

        Integer[][] vetor = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vetor[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vetor[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negatives Number: " + count);



        sc.close();
    }
}
