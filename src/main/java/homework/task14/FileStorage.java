package homework.task14;

import java.io.*;
import java.util.List;

public class FileStorage implements Storage {
    public final String FILEPATH;

    public FileStorage(String filepath) {
        this.FILEPATH = filepath;
    }

    @Override
    public void save(List<AddressItem> addressBook) throws Exception {
        FileOutputStream out = new FileOutputStream(FILEPATH);
        ObjectOutputStream stream = new ObjectOutputStream(out);
        for (AddressItem addressItem : addressBook) {
            stream.writeObject(addressItem);
        }
        stream.close();
    }

    @Override
    public List<AddressItem> load() throws IOException {
        FileInputStream inPut = new FileInputStream(FILEPATH);
        ObjectInputStream stream = new ObjectInputStream(inPut);

        return null;
    }

}

