package concurrency;

public class MessageRunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread0 = new Thread(new MessageRunnable());
        Thread thread1 = new Thread(new MessageRunnable(100));
        thread0.start();
        while(!thread0.isAlive()){
        }
        thread1.start();
        Thread.sleep(5000);
        thread0.interrupt();
        thread1.interrupt();

    }
}
