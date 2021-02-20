package concurrency;

public class MessageRunnable implements Runnable{
    final long time;

    public MessageRunnable(long time) {
        this.time = time;
    }

    public MessageRunnable() {
        this.time = 1000;
    }


    @Override
    public void run() {
        int count = 5;
        while (!Thread.currentThread().isInterrupted() && count-- > 0) {
            System.out.println("Aktualna temperatura: " + 100 + " " + Thread.currentThread().getName());
            //tutaj własny kod wykonywany w kazdej pętli wątku
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Przerwanie wątku");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("KONIEC WATKU" + Thread.currentThread().isInterrupted());
    }
}
