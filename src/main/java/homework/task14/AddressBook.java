package homework.task14;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static Scanner scanner = new Scanner(System.in);
    List<AddressItem> addressBook = new ArrayList<>();

    public AddressBook() {
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
        //TODO przeskakuje mi przy 2 dodaniu adresu "nameGiven" jest z automatu piste
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

        AddressItem addressAdded = new AddressItem(nameGiven,
                fullnameGiven,
                emailGiven,
                phoneNumberGiven,
                LocalDate.of(yearGiven, monthGiven, dayGiven));

        addressBook.add(addressAdded);

    }

    public void removeAddress(String fullName) {
        //TODO przy usuwaniu dodanego adresu powinno wyskoczyć poke o podanie imienia i nzwiska do
        // usunięcia niestety automatycznie jest pominięte jak to naprawić??

        for (AddressItem item : addressBook) {
            if (item.getFullName().equals(fullName)) {
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


    public void load() throws IOException {
        ObjectInputStream stream = null;
        AddressItem z;
        try {
            stream = new ObjectInputStream(new FileInputStream("c:\\data\\adressbook.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            while (stream != null) {
                z = (AddressItem) stream.readObject();
                addressBook.add(z);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (stream != null)
                stream.close();
        }
    }

    public void save() {
        ObjectOutput stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream("c:\\data\\adressbook.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            assert stream != null;
            stream.writeObject(addressBook);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
