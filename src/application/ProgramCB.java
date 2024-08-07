package application;

import entities.ContaBanco;

import java.util.Scanner;

public class ProgramCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBanco c1;


        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            c1 = new ContaBanco(number, holder, initialDeposit);
        }
        else {
            c1 = new ContaBanco(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(c1);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        c1.depositar(depositValue);
        System.out.println("Updated account data:");
        System.out.println(c1);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        c1.sacar(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(c1);



        sc.close();
    }
}
