package concurrency;

import java.util.Scanner;

public class MessageThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MessageThread threed = new MessageThread();
        System.out.println("Uruchamiam wątek!");
        threed.start();
        System.out.println("Wątek usuchomiony.");
        Scanner scanner = new Scanner(System.in);
        while(true){
            String command = scanner.nextLine();
            if ("q".equals(command)) {
                System.out.println("Watek interupted");
                threed.interrupt();
            }
            Thread.sleep(1000);
            if (!threed.isAlive()){
                System.out.println("Wątek już sie zakończylł");
                return;
            }
        }
    }
}
