package generics;

public class VonverterDemo {
    public static void main(String[] args) {
        Converter<LengthInMeter, LengthInMiles> converter = new LengthConverter();
     //   converter.convert(new LengthInMeter(300));
    }
}
