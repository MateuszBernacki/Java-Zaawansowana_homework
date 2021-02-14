package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ADAM");
        names.addAll(Arrays.asList("ALA", "OLA", "ROBERT"));
        // różnice od colection ponumerowane obiekty
        System.out.println(names);
        //metody interfejsu list a czego nie ma w colection
        System.out.println("Pobranie elementu o indeksie: ");
        System.out.println(names.get(2));
        System.out.println("Wstawienie elementu na podanej pozycji: ");
        names.add(1, "BEATA");
        System.out.println(names);
        //usuwamy pozycje o indexie
        System.out.println("usuwanie elementu z podanej pozycji");
        names.remove(0);
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Wstawienie kolekcji począwszy od indexu");
        names.addAll(2, Arrays.asList("EWA", "TOMEK"));
        System.out.println(names);
        System.out.println("Tworzenie podlisty:");
        List<String> subList = names.subList(2, 4);
        System.out.println(subList);
        subList.add("xxxx");
        System.out.println(names);
        System.out.println("Modyfikacja całej listy");
        System.out.println(names);
        System.out.println("tworzenie kopii listy");
        List<String> copy = new ArrayList<>(subList);
        copy.add("yyyyyy");
        System.out.println(copy);
        System.out.println(subList);
    }
}
