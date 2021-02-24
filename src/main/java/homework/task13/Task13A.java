package homework.task13;

import java.util.*;

/**
 * CZESC 1
 * Na podstawie otrzymanej kolekcji miast (obiekty klasy City) stwórz kolejne kolekcje (elementy z kolekcji kopiujemy do nowej):
 * - zbiór kodów państw, w których znajdują się miasta (kod zawarty jest w polu countryCode) (*)
 * - listę miast leżących w Polsce                                                           (*)
 * - listę miast o populacji powyżej 1_000_000                                               (*)
 * - mapę, w której kluczem jest nazwa miasta a wartością obiekt City                        (**)
 * - mapę, w której kluczem jest zaokrąglona do liczby całkowitej szerokość geograficza a wartością lista miast o takiej szerokości (***)
 * Każdy z punktów nalezy zdefiniować w osobnych metodach w postaci
 *      typ_kolekcji nazwa_metody(Collection<City> cities);
 * np.:
 *      public static Set<City> countryCodes(Collection<City> cities){
 *
 *      }
 * W funkcji main wywołaj każdą z metod i wyświetl cześć każdej otrzymanej kolekcji np. pierwszych 100 elementów
 * CZESC 2
 * Zmodyfikuj otrzymane kolekcje z punktu 1 zgodnie z poniższymi punktami:
 *  - usuń z kolekcji cities miasta o populacji mniejszej od 10_000 (*)
 *  - w kolekcji miast o populacji powyżej 1_000_000 usuń miasta niemieckie (*)
 *  - w kolekcji miast polskich, za każdym miastem, które w nazwie zawiera słowo Nowa .. dodaj miasto Stara .. np.
 *    Nowa Sól -> Stara Sól, pozostałe dane skopiuj z pasującego miasta (**)
 * W każdym zadaniu wykorzystaj iterator, także każdy z punktów umieść w osobnej metodzie, podobnie jak w części 1
 * Gwiazdkami oznaczony jest stopień trudności.
 */
public class Task13A {
    public static void main(String[] args) {
        Collection<City> cities = Cities.loadCities(Task13A.class.getResourceAsStream("../../cities500.txt"));
        for (City c : cities) {
            if (c.getCountryCode().equals("PL") && c.getName().equals("Stara Sól")) {
                System.out.println(c);
            }
        }

        List<String> citiesInPoland = new ArrayList<>();
        List<String> citisWithPopulatiionOver1M = new ArrayList<>();
        Map<String, City> mapCitis = new HashMap<>();

        for (City c : cities) {

            if (c.getCountryCode().equals("PL")) {
                citiesInPoland.add(c.getName());
            }
            if (c.getPopulation() > 1_000_000) {
                citisWithPopulatiionOver1M.add(c.getName());
            }
            mapCitis.put(c.getName(), c);

        }

        //iterator zamiany nazwy Nowa Sól na Sara Sól
        Iterator<String> iterator = citiesInPoland.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.contains("Nowa ")){
     //           iterator.next().
            }
        }


        //NIEMIECKIE MIASTO O POPULACJI POWYŻEJ MILIONA USUNIĘTE
//        Iterator<City> cityListIterator = cities.iterator();
//        while(cityListIterator.hasNext()){
//            City item = cityListIterator.next();
//            if (item.getPopulation() > 1_000_000 && item.getCountryCode().equals("DE")){
//                System.out.println(item.getName() +" miato zostało usunięte");
//                cityListIterator.remove();
//            }
//        }

        //USUWANIE MIASTA O POPULACJI WIEKSZEJ OD 10_000
//        Iterator<City> cityListIterator = cities.iterator();
//        while(cityListIterator.hasNext()){
//            City item = cityListIterator.next();
//            if (item.getPopulation() < 10_000){
//                System.out.println(item.getName() +" miato zostało usunięte");
//                cityListIterator.remove();
//            }
//        }


//        for (String n :
//                citiesInPoland) {
//            System.out.println(n);
//        //
//        for (String n :
//                citisWithPopulatiionOver1M) {
//            System.out.println(n);
//        }

    }
}

