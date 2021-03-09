package homework.task14;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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



        //LICZY ILOŚĆ LINI W PLIKU TASK14.TXT
        //TODO JAK PODAĆ ŚCIEŻKĘ DO PLIKU W IDE???
        List<String> lines = new ArrayList<>();
        List<String> numberOfWords = new ArrayList<>();
        List<String> countWordsFourLeters = new ArrayList<>();
        List<Integer> numbersList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("c:\\data\\task14.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
                String[] result = line.split(" ");
                numberOfWords.addAll(Arrays.asList(result));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku!");

        } catch (IOException e) {
            System.out.println("Bład odczytu, brak danych");
        }
        for (String words : numberOfWords) {
            if (words.length() == 4) {
                countWordsFourLeters.add(words);
            }
        }
        Pattern pattern = Pattern.compile("-?[0-9]+");
        for (String numberOfWord : numberOfWords) {
            Matcher m = pattern.matcher(numberOfWord);
            while(m.find()){
                int a = Integer.parseInt(m.group());
                numbersList.add(a) ;
            }
        }

        System.out.println("Ilosć lini: " + lines.size());
        System.out.println("Ilość słów: " + numberOfWords.size());
        System.out.println("Ilość słów po 4 znaki to: " + countWordsFourLeters.size());
        System.out.println("Ilość liczb: " +numbersList.size());

        //CZĘŚĆ 2 ZADANIA WPROWADZENIE DANYCH DO PLIKU
        try(PrintWriter print = new PrintWriter(new FileWriter("c:\\data\\out_task14.txt"))){
            print.println("Ilosć lini: " + lines.size());
            print.println("Ilość słów: " + numberOfWords.size());
            print.println("Ilość słów po 4 znaki to: " + countWordsFourLeters.size());
            print.println("Ilość liczb: " +numbersList.size());
            print.println();
            print.println("Lista wyrazów po 4 litery: ------------------------------");
            for (String countWordsFourLeter : countWordsFourLeters) {
                print.println(countWordsFourLeter);
            }
            print.println();
            print.println("Lista wszystkich liczb: -----------------------------");
            for (Integer integer : numbersList) {
                print.println(integer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

