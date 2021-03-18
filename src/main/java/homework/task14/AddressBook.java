package homework.task14;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    List<AddressItem> addressBook =new ArrayList<>();

    public AddressBook() throws IOException {
    }

    public List<AddressItem> getAddressBook() {
        return addressBook;
    }

    public void fullList() {
        for (AddressItem item : addressBook) {
            System.out.println(item);
        }
    }

    public void addAddressToBook() {

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
        scanner.nextLine();

        AddressItem addressAdded = new AddressItem(nameGiven,
                fullnameGiven,
                emailGiven,
                phoneNumberGiven,
                LocalDate.of(yearGiven, monthGiven, dayGiven));

        addressBook.add(addressAdded);

    }

    public void removeAddress(String fullName) {
        for (AddressItem item : addressBook) {
            if (item.getFullName().contains(fullName)) {
                System.out.println("Czy chcesz usunąć adres: Y/N: ");
                String odpowiedz = scanner.nextLine();
                if (odpowiedz.equals("Y")) {
                    System.out.println("Adres został usunięty.");
                    addressBook.remove(item);
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

    public void serch(String name) {
        for (AddressItem item : addressBook) {
            if (item.getName().equals(name)) {
                System.out.println("Odnaleziono; " + item);
            } else {
                System.out.println("Taka osoba nie istnieje.");
            }
        }
    }
}
