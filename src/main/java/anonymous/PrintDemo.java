package anonymous;

import interfaces.MyBank;
import interfaces.Printable;
import interfaces.Report;

public class PrintDemo {
    public static void main(String[] args) {
        Printable[] toPrint = new Printable[3];
        toPrint[0] = new Report("Zawartość");
        //tworzenie obiektu klasy anonimowej implementującej interface printable
        toPrint[1] = new Printable() {
            static final int COPPIES = 5;
            //mozna implementować dowolną ilość metod prywatnych
            private void intro(String device){
                System.out.println("printiong yousing device: " + device);
            }
            @Override
            public String print(String device) {
                return "obiekt klasy anonimowej" + COPPIES;
            }
        };
        toPrint[2] = new MyBank();
        for (Printable p :
                toPrint) {
            System.out.println(p.print("HP"));
        }
    }
}
