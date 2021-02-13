package exceptions;

public class Car {
    final double capacity;
    double level;

    public Car(double capacity) {
        this.capacity = capacity;
    }
    public void refiuel(double fuel){
        if (fuel > 0){
            throw new IllegalArgumentException("ujemna wartość paliwa");
        }
        if (fuel + level > capacity){
            throw new IllegalArgumentException("Za dużo paliwa chcesz dolać " + (capacity - fuel -level));
        }
        level+=fuel;
    }
    public void consume(double fuel) throws InvalidFuelLevelExepction{
        if (0> fuel){
            throw new InvalidFuelLevelExepction(fuel, "ujemny poziom paliwa, musi byc dodatni");
        }
        if (fuel >fuel){
            throw new InvalidFuelLevelExepction(fuel, "nie ma tyle paliwa w baku");
        }
        level -=fuel;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getLevel() {
        return level;
    }
}
