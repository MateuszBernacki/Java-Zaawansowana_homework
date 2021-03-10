package homework.task14;
import java.time.LocalDate;
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

    public static void main(String[] args) {

        MenuItem addAddress = new MenuItem("Dodaj nowy adres", 1);
        MenuItem delateAddress = new MenuItem("Usuń adres", 2);
        MenuItem showAll = new MenuItem("Wyświetl całą zawartość", 3);
        MenuItem serch = new MenuItem("Wyszykiwanie na podstawie Imienia", 4);
        MenuItem exit = new MenuItem("EXIT", 5);

        Callback loadAddAddress = new Callback() {
            @Override
            public void action() {
                System.out.println("Podaj dane adresowe: ");
                System.out.println("Podaj imie: ");
                String nameGiven = scanner.nextLine();
                System.out.println("Podaj imie i nazwisko: ");
                String fullnameGiven = scanner.nextLine();
                System.out.println("Podaj adres email: ");
                String emailGiven = scanner.nextLine();
                System.out.println("Podaj numer telefonu: ");
                String phoneNumberGiven = scanner.nextLine();
                System.out.println("Podaj date urodzenia: ");
                System.out.println("Dzień: ");
                int dayGiven = scanner.nextInt();
                System.out.println("Miesiąc: ");
                int monthGiven = scanner.nextInt();
                System.out.println("Rok: ");
                int yearGiven = scanner.nextInt();

                AddressItem newAddress = new AddressItem(nameGiven,
                        fullnameGiven,
                        emailGiven,
                        phoneNumberGiven,
                        LocalDate.of(yearGiven, monthGiven, dayGiven));

                AddressBook addAddressToBook = new AddressBook();
                addAddressToBook.addAddressToBook(newAddress);
                addAddressToBook.save();
            }
        };
        addAddress.setCallback(loadAddAddress);

        Callback loadDelateAddress = new Callback() {
            @Override
            public void action() {
                AddressBook addAddressToBook = new AddressBook();
                System.out.println("Usuwanie adresu, podaj imie i nazwisko: ");
                String fullnameGiven = scanner.nextLine();
                for (AddressItem item : addAddressToBook.addressBook) {
                    if (item.getFullName().equals(fullnameGiven)) {
                        System.out.println("Czy chcesz usunąć adres: Y/N: ");
                        String odpowiedz = scanner.nextLine();
                        if (odpowiedz.equals("Y")) {
                            System.out.println("Adres został usunięty.");
                            addAddressToBook.addressBook.remove(item);
                        }
                        if (odpowiedz.equals("N")) {
                            System.out.println("Adres pozostał.");
                            break;
                        }
                    } else {
                        System.out.println("Nieodpowiedni wybór.");
                        break;
                    }
                }
            }
        };
        delateAddress.setCallback(loadDelateAddress);

        Callback loadShowAll = new Callback() {
            @Override
            public void action() {
                AddressBook addAddressToBook = new AddressBook();
                for (AddressItem item : addAddressToBook.addressBook){
                    System.out.println(item);
                }
            }
        };
        showAll.setCallback(loadShowAll);

        Callback loadSerch = new Callback() {
            @Override
            public void action() {
                AddressBook addAddressToBook = new AddressBook();
                System.out.println("Podaj imie osoby wyszukiwanej: ");
                String name = scanner.nextLine();
                for (AddressItem item : addAddressToBook.addressBook) {
                    if (item.getName().equals(name)){
                        System.out.println("Odnaleziono; "+ item);
                    }
                }
            }
        }; serch.setCallback(loadSerch);

        Callback loadExit = new Callback() {
            @Override
            public void action() {
                System.exit(0);
            }
        }; exit.setCallback(loadExit);


        Menu menu = new Menu(List.of(addAddress,delateAddress,showAll,serch,exit));
        while (true) {
            menu.print();
            int itemNumber = scanner.nextInt();
            menu.process(itemNumber);
        }
    }
}
