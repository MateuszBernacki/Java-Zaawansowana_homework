package concurrency;

import java.util.Random;

public class CounterThread extends Thread{
    final Counter counter;
    private int localCounter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        Random random = new Random();
        int count = 10;
        while (!this.isInterrupted() && count-- > 0) {
            // zakomentowany kod dotyczy gdy metoda inc() nie jest synchronizowana

//            synchronized (counter) { // synchronizacja na wspólnym obiekcie
//                counter.inc(); // sekcja krytyczna bo odwołujemy sie do wpolnego obiektu dla wszystkich watkow
//            }
            counter.inc(); // nie musimy umieszczac w bloku sinchronized bo metoda inc jest synchronizowana w swoim
            localCounter++;
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                System.out.println("Przerwanie wątku");
                this.interrupt();
            }
        }
        System.out.println("KONIEC WATKU" + this.isInterrupted());
    }

    public int getLocalCounter() {
        return localCounter;
    }

    public Counter getCounter() {
        return counter;

    }
}
