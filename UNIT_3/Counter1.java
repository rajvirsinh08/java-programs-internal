class Counter {
    int count = 0;

    synchronized void increment() {
        try {
            count++;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    public Counter c;

    public CounterThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class Counter1 {
    public static void main(String[] args) {
        try {
            Counter counter = new Counter();

            CounterThread t1 = new CounterThread(counter);
            CounterThread t2 = new CounterThread(counter);
            CounterThread t3 = new CounterThread(counter);

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();

            System.out.println("Final Counter Value: " + counter.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}