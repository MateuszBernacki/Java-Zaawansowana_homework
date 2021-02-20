package concurrency;

public class Counter {
    int count;

    synchronized void inc(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
