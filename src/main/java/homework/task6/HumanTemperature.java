package homework.task6;
/*2. Klasa HumanTemperature przechowująca temperaturę człowieka (zakres wartości od 20 do 43 stopni)
 *    metody:
 *    - get() zwraca temperaturę w stopniach Celsjusza (double lub float)
 *    - getKelvin() - temperatura w stopniach Kelvina (double lub float)
 *    - getFahrenheit() - temperatury w stopniach Fahrenheita (double lub float)
 *    - isNormal() - zwraca true jeśli mieści się w granicach miedzy 36-37 stopni Celsjusza
 *    - format() - zwraca łańcuch z temperaturą i symbolem jednostki °C z dwoma miejscami po przecinku np. 36,85 °C
*/




public class HumanTemperature {
    final double temperature;

    private HumanTemperature(double temperature) {
        this.temperature = temperature;
    }

    public static HumanTemperature of(double temperature){
        if (temperature < 20 || temperature > 43) System.out.print("Temperature is incorrect. Your result is: ");
        return new HumanTemperature(temperature);
    }

    public double getTemperature() {
        return temperature;
    }

    public double getKelvin(){
        System.out.print("Temperature in Kelvin: ");
        return temperature + 273.15;
    }
    public double getFahrenheit (){
        System.out.print("Temperature in Fahrenheit: ");
        return (temperature*1.8) + 32;
    }
    public boolean isNormal(){
        return temperature > 36 && temperature < 37;
    }
    public String format(){
        char i= '\u00B0';
        System.out.print(getTemperature());
        return  i + "C";
    }

    @Override
    public String toString() {
        return "Human Temperature " + temperature;
    }
}
