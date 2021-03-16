package homework.task14;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * Napisz program, który obsługuje książkę adresową zapisywaną w pliku.
 * Format pliku jest binarny, a zapisywane są serializowane obiekty klasy
 * AddressItem. Dodaj do tej klasy odpowiedni interfejs, który umożliwia serializację.
 * Program powinien umożliwiać:
 * - dodanie nowego adresu
 * - usunięcie adresu
 * - wyświetlenie całej zawartości
 * - wyszukanie na podstawie pola name lub phoneNumber adresu lub adresów (dla pola name)
 */
public class Task14B {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        AddressBook addingAddressToBook = new AddressBook();
        FileStorage storage = new FileStorage("c:\\data\\adressbook.ser");

        MenuItem addAddress = new MenuItem("Dodaj nowy adres", 1);
        MenuItem delateAddress = new MenuItem("Usuń adres", 2);
        MenuItem showAll = new MenuItem("Wyświetl całą zawartość", 3);
        MenuItem serch = new MenuItem("Wyszykiwanie na podstawie Imienia", 4);
        MenuItem exit = new MenuItem("EXIT", 5);

        Callback loadAddAddress = new Callback() {
            @Override
            public void action() {
                addingAddressToBook.addAddressToBook();
            }
        };
        addAddress.setCallback(loadAddAddress);

        Callback loadDelateAddress = new Callback() {
            @Override
            public void action() {
                System.out.println("Usuwanie adresu, podaj imie i nazwisko: ");
                String fullnameGiven = scanner.nextLine();
                addingAddressToBook.removeAddress(fullnameGiven);
            }
        };
        delateAddress.setCallback(loadDelateAddress);

        Callback loadShowAll = new Callback() {
            @Override
            public void action() {
                addingAddressToBook.fullList();
            }
        };
        showAll.setCallback(loadShowAll);

        Callback loadSerch = new Callback() {
            @Override
            public void action() {
                System.out.println("Podaj imie osoby wyszukiwanej: ");
                String name = scanner.nextLine();
                addingAddressToBook.serch(name);
            }
        };
        serch.setCallback(loadSerch);

        Callback loadExit = new Callback() {
            @Override
            public void action() {
                storage.save();
                System.exit(0);
            }
        };
        exit.setCallback(loadExit);
        Menu menu = new Menu(List.of(addAddress, delateAddress, showAll, serch, exit));
        while (true) {
            menu.print();
            int itemNumber = scanner.nextInt();
            menu.process(itemNumber);

        }
    }
}

