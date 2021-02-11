package homework.task5;



public class CarTest {
    public static void main(String[] args) {
        GasCar car1 = new GasCar(10, 30);
        GasCar car2 = new CrashGasCar(10,30);



        //metoda CrashGusCar psuje metody z GasCar
        System.out.println("-------------------");
        System.out.println(car2.consume(30));
        System.out.println(car2.fuelStatus());
        System.out.println(car2.consume(-10));
        System.out.println(car2.fuelStatus());
        System.out.println(car2.refuel(10));
        System.out.println(car2.fuelStatus());
        System.out.println(car2.consume(5));
        System.out.println(car2.fuelStatus());

        //Poprawna metoda GasCar
        System.out.println("-------------Car1---------------------------");
        System.out.println(car1.fuelStatus());
        System.out.println("--------------------");
        System.out.println(car1.refuel(25));
        System.out.println(car1.fuelStatus());
        System.out.println(car1.refuel(-10));
        System.out.println(car1.fuelStatus());
        System.out.println(car1.refuel(5));
        System.out.println(car1.fuelStatus());


    }
}
