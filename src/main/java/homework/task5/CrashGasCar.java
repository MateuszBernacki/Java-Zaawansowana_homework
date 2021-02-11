package homework.task5;

public class CrashGasCar extends GasCar{
    public CrashGasCar(double fuelLevel, double fuelCapacity) {
        super(fuelLevel, fuelCapacity);

    }

    @Override
    public double refuel(double fuel){
        fuelLevel += fuel;
        return this.fuelLevel;
    }
    @Override
    public double consume(double fuel) {
        fuelLevel -= fuel;
    return this.fuelLevel;
    }
}
