package generics;

public class StringBoxAble implements Boxable<String> {
    final String str;


    public StringBoxAble(String str) {
        this.str = str;
    }

    @Override
    public String getValue() {
        return str;
    }
}
