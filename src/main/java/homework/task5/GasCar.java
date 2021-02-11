package homework.task5;

/**
 * CZESC 1
 * Uzupełnij poniższą klasę i:
 * - modyfikatory dostępu dla obu pól, aby żadne z nich nie mogło być zmieniane przez inne klasy
 * - jedno z pól musi być final
 * - zdefiniuj konstruktor, który tworzy samochód z pustym bakiem, ale z podaną objętością baku
 * - zdefiniuj obie metody wg opisów
 * - zdefiniuj metodę, która zwraca aktualną wartość poziomu paliwa w baku
 * CZESC 2
 * Wyprowadz klasę z GasCar, w której spróbuj zepsuć działanie obu metod (nadpisując je, tak aby np. można było zatankować ujemną
 * objętość paliwa, lub nalać więcej niż wynosi. Napisz krótki program demonstrujący czy to Ci się udało.
 *
 */
public class GasCar {
    double fuelLevel;
     final double fuelCapacity;

    public GasCar(double fuelLevel, double fuelCapacity) {
        this.fuelLevel = fuelLevel;
        this.fuelCapacity = fuelCapacity;
    }

    public String fuelStatus () {
        return "Fuel level: " + fuelLevel;
    }
    /**
     * Metoda tankowania, powinna zmieniać poziom paliwa w fuelLevel
     * @param fuel objętość paliwa, które chce się dolać do baku
     * @return rzeczywista objętośc paliwa dolanego do baku
     *
     *
     * PRZYKLADY
     * Dla obiektu o parametrach
     * fuelCapacity równe 30
     * fuelLLevel równe 10
     * Przykład 1
     * wywołano metodę refuel(25) i zwrócona wartość wynosi 5, gdyż w baku jest miejsce tylko dla 20 litrów
     * Przykład 2
     * wywołano metodę refuel(-10) i zwrócona wartość wynosi 0, gdyż nie można dolać ujemnej wartości paliwa
     * Przykład 3
     * wywołano metodę refuel(5) i zwrócona wartość wynosi 5, gdyż cała porcja zmieściła się w abku
     */
    public double refuel(double fuel){
        if (fuel < 0) {
            return 0;
        }
        if (fuelLevel + fuel < fuelCapacity) {
            System.out.print("Refueled: ");
            return fuelLevel += fuel;
        }
        if (fuelLevel + fuel > fuelCapacity) {
            double i = (fuel + fuelLevel) - fuelCapacity;
            fuelLevel = (fuelLevel + fuel) - i;
            return i;
        }
        if (fuelLevel == fuelCapacity ) System.out.print("Fuel tank is full: ");
        return 0;
    }

    /**
     * Metoda symulująca zużycie podanej porcji paliwa i zmieniająca fuelLevel
     * @param fuel objętość paliwa, które chce się zużyć
     * @return rzeczywista objętość zużytego paliwa
     *
     * Kontrakt jest podobny do metody refuel, z tą różnica, że powoduje zmniejszenie poziomu paliwa
     * PRZYKLADY
     * Dla obiektu o parametrach
     *  fuelCapacity równe 30
     *  fuelLLevel równe 10
     *Przykład 1
     * wywołano metodę consume(30) i otrzymano wartość 10, gdyż tylko tyle można zużyć, bak został pusty
     * wywołano metodę consume(-10) i otrzymano wartośc 0, bo nie można zużyć ujemnego paliwa
     * wywołano metodę consume(2) i otrzymano wartość 2, gdyż w baku było 10, więc zużyto 2 i pozostało jeszcze 8
     */
    public double consume(double fuel){
        if (fuel < 0) {
            System.out.print("Given amount of gas to consume is incorrect. Fuel level is: ");
            return fuelLevel;
        }
        if (fuel > fuelLevel) {
            double i = fuelLevel;
            fuelLevel-=fuelLevel;
            return i;
        }
        if (fuel < fuelLevel) System.out.print("Fuel: ");
        fuelLevel-= fuel;
        return fuel;
    }
}
