package inner;

public class Car {
    private Radio radio;
    private int power;

    public Car() {

    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public Car(Radio radio) {
        this.radio = radio;
    }



    static public class Radio {
        int price;

        public Radio(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Radio{" +
                    "price=" + price +
                    '}';
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "radio=" + radio +
                '}';
    }
}
