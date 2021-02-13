package exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz date w spostaci rrrr-mm-dd: ");
        String dateStr = scanner.nextLine();
        try {
            LocalDate date = LocalDate.parse(dateStr);
            System.out.println("Poprawna data " + date);
        } catch (DateTimeParseException e ){
            System.out.println("Niepoprawny format daty.");
        }
    }
}
