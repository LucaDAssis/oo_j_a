package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioLista {
    public static void main(String[] args) {
        //Criando a Lista;
        List<String> list = new ArrayList<>();
        //Adicionando na Lista
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add(2, "Mudando a posição dois que era a letra C agora é a letra G");
        list.add("Lucas");
        list.add("Pedro");
        list.add("Pedro");

        for (String letra : list) {
            System.out.println(letra);
        }
        System.out.println("=================================");
        list.remove(0);
        //aqui usei o startsWith para pegar a primeira letra
        list.removeIf(letra -> letra.startsWith("P"));
        for (String letra : list) {
            System.out.println(letra);
        }
        System.out.println("Index of Lucas" + list.indexOf("Lucas"));
        System.out.println("Index of Pedro" + list.indexOf("Pedro"));
        System.out.println("------------------------------");
        //aqui usei o charAt(0) pra pegar a primeira letra.
        List<String> result = list.stream().filter(letra -> letra.charAt(0) == 'L').collect(Collectors.toList());
        for (String letra : result) {
            System.out.println(letra);
        }
        System.out.println("==================================");
        String name = list.stream().filter(letra -> letra.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
