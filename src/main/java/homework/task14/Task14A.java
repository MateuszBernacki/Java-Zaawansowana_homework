package homework.task14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * CZĘŚĆ 1
 * W pliku task14.txt znajduje się tekst. Wczytaj go i policz:
 * - liczbę słów
 * - liczbę wierszy
 * - liczbę słów 4-literowych
 * - liczbę słów, które są liczbami (całkowite lub dziesiętne np. 12, 34,45 itd.)
 *
 * CZĘŚĆ 2
 * Zapisz do pliku out_task14.txt wyniki uzyskane z części 1 plus:
 * - listę słów 4-literowych
 * - listę wszystkich liczb
 * Lokalizację pliku out_task14.txt możesz wybrać dowolną np. w bieżącym katalogu
 */
public class Task14A {
    public static void main(String[] args) {
        //W taki sposób tworzymy strumień wejściowy do plików w katalogu resources
        InputStream input = Task14A.class.getResourceAsStream("../../task114.txt");
        //sekwencja ../ powoduje przejście o katalog wyżej
        //dwie sa konieczne ponieważ każdy pakiet to katalog, a mamy pakiet task14 w pakiecie homework

        //TODO JAK DODAC DO METODY KOD ZLICZAJACY SŁIWA
        //LICZY ILOŚĆ SŁÓW W PLIKU TASK14.TXT
//            Scanner scanner = new Scanner(input);
//            int countWords = 0;
//            while (scanner.hasNext()) {
//                scanner.next();
//                countWords++;
//            }
//            System.out.println("Ilość słów to: " + countWords);
//            scanner.close();
//

        //LICZY ILOŚĆ LINI W PLIKU TASK14.TXT
        //TODO JAK PODAĆ ŚCIEŻKĘ DO PLIKU W IDE???
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("c:\\data\\task14.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku!");

        } catch (IOException e) {
            System.out.println("Bład odczytu, brak danych");
        }
        System.out.println("Ilosć lini: " +lines.size());
        System.out.println("\b\b");

    }
}
