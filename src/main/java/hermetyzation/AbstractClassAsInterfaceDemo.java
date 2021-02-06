package hermetyzation;

import java.util.Random;

public class AbstractClassAsInterfaceDemo {
    public static void main(String[] args) {
        Bank bank = new HermesBank();
        Random random = new Random();

        while(true){
            // symulacja wpłaty
            final String feedback = bank.credit(random.nextInt(1000));
            System.out.println(feedback);
            //sprawdzamy czy mamy na konccie odpowiednia ilosc pieniedzy
            if (bank.balance() >= 100_000){
                System.out.println("Możesz kupić samochód.");
                break;
            }
        }
        System.out.println("stan konta: " + bank.balance());
        System.out.println(bank.debit(200_000));
        System.out.println("stan konta: " + bank.balance());
    }
}
