package exceptions;

public class CarDemo {
    public static void main(String[] args) throws InvalidFuelLevelExepction {
        Car car = new Car(30);
        car.refiuel(20);
        System.out.println(car.getLevel());
        try {
            car.consume(-20);
        } catch (InvalidFuelLevelExepction e) {
            System.out.println(e.getMessage() + " invalid value: " + e.getFuellevel());
            e.printStackTrace();
        }
   // car.consume(-20);
    }
}
