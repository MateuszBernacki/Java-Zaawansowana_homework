package exceptions;

import java.util.Scanner;

/*
Kombinacja klauzuli t rty .. catch .. finally:

- try .. catch
- try .. catch .. finally
- try .. finally

catch morze być wiele, wyjatek finaly zawzse sie wykona.
*/

public class FinallyExample {
    public static int parse(String str) {
        //czesc 2
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
            //blok finally dominuje nad wszystkimi returnamiw metodzie
            //i tylko jego return zwróci wartość metody
        } finally {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        try {
            int number = Integer.parseInt(str);
            System.out.println("Koniec " + number);
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawna liczba calkowita.");
        }
        finally {
            System.out.println("KONIEC");
        }
        //czesc 2
        System.out.println("czesc 2 " +str);
        System.out.println(parse(str));
    }
}
