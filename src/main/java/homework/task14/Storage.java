package homework.task14;

import java.io.IOException;
import java.util.List;

public interface Storage {
    void save(List<AddressItem> addressBook) throws Exception;
    List<AddressItem> load() throws IOException;

}
