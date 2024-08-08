package application;

import entities.Reservas;

import java.util.Scanner;

public class ProgramReservas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        Reservas[] reservas = new Reservas[10];
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1));
            sc.nextLine();
            System.out.print("Name: " );
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();
            reservas[roomNumber] = new Reservas(nome, email);
        }

        System.out.println();
        System.out.println("Busy Rooms: ");
        for (int i = 0; i < 10; i++) {
            if (reservas[i] != null) {
                System.out.println( i + ": " + reservas[i]);
            }
        }



        sc.close();
    }
}
