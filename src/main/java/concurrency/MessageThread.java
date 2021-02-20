package concurrency;

public class MessageThread extends Thread {
    @Override
    public void run() {
        int count = 5;
        while (!this.isInterrupted() && count-- > 0 ) {
            System.out.println("Aktualna temperatura: " + 100);
            //tutaj własny kod wykonywany w kazdej pętli wątku
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Przerwanie wątku");
                this.interrupt();
            }
        }
        System.out.println("KONIEC WATKU");
    }
}
