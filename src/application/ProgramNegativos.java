package application;

import java.util.Scanner;

public class ProgramNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos Numeros Voce vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int negativo = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            System.out.println("--------------------");
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros Vegativos!!");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }






        sc.close();
    }
}
