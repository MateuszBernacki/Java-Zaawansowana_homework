package generics;

public class UniversalLenghtConverter <T extends Length, R extends Length> implements Converter<T,R>{
    @Override
    public R convert(T value) {
        return null;
    }
}
