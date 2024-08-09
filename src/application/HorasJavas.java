package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class HorasJavas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDateTime   hoje01 = LocalDateTime.now();
        Instant hoje02 = Instant.now();
        LocalDate hoje03 = LocalDate.of(2024,02,02);

        System.out.println(hoje.toString());
        System.out.println(hoje01.toString());
        System.out.println(hoje02.toString());
        System.out.println(hoje03.toString());
    }
}
