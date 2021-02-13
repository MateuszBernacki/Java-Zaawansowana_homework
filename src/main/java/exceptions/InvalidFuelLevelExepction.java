package exceptions;

public class InvalidFuelLevelExepction extends Exception{
    private final double fuellevel;

    public InvalidFuelLevelExepction(double fuellevel, String s) {
        this.fuellevel = fuellevel;
    }

    public double getFuellevel() {
        return fuellevel;
    }
}
