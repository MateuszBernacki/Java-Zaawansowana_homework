package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("ADAM");
        names.addAll(Arrays.asList("ALA", "OLA", "ROBERT"));
        for (String item :
                names) {
            System.out.println(item);
        }
        System.out.println(names);
        names.remove("ADAM");
        System.out.println(names);
        System.out.println("Usuniecie imienia OLA");
        String ola = new String("OLA");
        names.remove(ola);
        System.out.println(names);
        System.out.println("Czy w kolekcji jest obiekt");
        System.out.println(names.contains("ROBERT"));
        System.out.println("czy kolekcja jest pusta: ");
        System.out.println(names.isEmpty());
        System.out.print("rozmiar kolejki " + names.size());
        System.out.println("wyczyszczenie kolekcji: ");
        names.clear();
        System.out.println(names);
    }
}

/*
wyświetlanie listy na 2 sposoby
    for (String item :
         names) {
         System.out.println(item);
         }
         System.out.println(names);
   */

/*
* Usuwanie z kolekcji
*   names.remove("ADAM");
        System.out.println(names);
        System.out.println("Usuniecie imienia OLA");
        String ola = new String("OLA");
        names.remove(ola);
        System.out.println(names);
        * */
//SPRAWDZA CZY W KOLEKCJI JEST OBIEKT ZWRCA TRUA&FALSE
//        System.out.println(names.contains("ROBERT"));