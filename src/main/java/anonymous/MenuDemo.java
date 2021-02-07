package anonymous;

import java.util.Scanner;

public class MenuDemo {
    static Scanner scanner = new Scanner(System.in);
    static int var1;
    static int var2;
    public static void main(String[] args) {

        MenuItem loadItem1 = new MenuItem("Wczytaj pierwsza zmienna", 1);
        MenuItem loadItem2 = new MenuItem("Wczytaj drugą zmienna", 2);
        MenuItem calcItem = new MenuItem("Oblicz sume zmiennych", 3);
        MenuItem endItem = new MenuItem("Koniec", 0);
        Callback loadVa2Callback = new Callback() {
            @Override
            public void action() {
                System.out.println("Podaj liczbę: ");
                var2 = scanner.nextInt();
            }
        };
        loadItem2.setCallback(loadVa2Callback);
        Callback loadVa1Callback = new Callback() {
            @Override
            public void action() {
                System.out.println("Podaj liczbe: ");
                var1 = scanner.nextInt();
            }
        };

        loadItem1.setCallback(loadVa1Callback);
        Callback loadcalcItem = new Callback() {
            @Override
            public void action() {
                System.out.println("Suma liczby 1 i 2 wynosi: " + (var1 + var2));
            }
        };
        calcItem.setCallback((loadcalcItem));
        Callback endCallback = new Callback() {
            @Override
            public void action() {
                System.exit(0);
            }
        };
        endItem.setCallback(endCallback);
        Menu menu = new Menu(new MenuItem[] {loadItem1,loadItem2,calcItem,endItem});
//        Menu menu = new Menu(new MenuItem[]{
//                new MenuItem("Polecenie 1", 1),
//                new MenuItem("Polecenie 2", 2),
//                new MenuItem("Koniec", 0)
//            }
//        );
        while(true) {
            menu.print();
            int itemNumber = scanner.nextInt();
            menu.process(itemNumber);
        }
    }
}
