package application;

import entities.Peixes;

import java.util.Scanner;

public class ProgramPeixe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Peixes peixes = new Peixes();
        peixes.setNome("Corvina");
        peixes.setPeso(10.00);
        peixes.setPreco(19.00);

        System.out.println(peixes);





        sc.close();
    }
}
