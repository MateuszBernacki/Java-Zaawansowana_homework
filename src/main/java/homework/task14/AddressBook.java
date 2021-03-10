package homework.task14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<AddressItem> addressBook = new ArrayList<>();

    public AddressBook() {
    }

    public List<AddressItem> getAddressBook() {
        return addressBook;
    }

    public void addAddressToBook(AddressItem newAddress) {
        addressBook.add(newAddress);
    }

    public void save() {
        RandomAccessFile stream = null;
        try {
            stream = new RandomAccessFile("c:\\data\\adressbook.txt", "rw");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        try {
            assert stream != null;
            for (AddressItem s : addressBook) {
                stream.writeChars(String.valueOf(s));
            }
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadAddressBook(){
        RandomAccessFile stream = null;
        try {
            stream = new RandomAccessFile("c:\\data\\adressbook.txt", "r");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        try {
            assert stream != null;
                stream.readLine();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
