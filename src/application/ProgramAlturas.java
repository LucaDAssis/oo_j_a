package application;

import java.util.Scanner;

public class ProgramAlturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double avg = sum / n;
        System.out.println("Average is " + avg);




        sc.close();
    }
}
