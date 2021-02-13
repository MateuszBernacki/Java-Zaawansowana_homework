package generics;

public class LengthConverter implements Converter<LengthInMeter , LengthInMiles>{


    @Override
    public LengthInMiles convert(LengthInMeter value) {
        return new LengthInMiles(value.getLenght()/1.8);
    }
}
