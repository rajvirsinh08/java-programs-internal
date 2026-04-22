class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int val) {
        while (available) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        data = val;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.produce(i);
        }
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.consume();
        }
    }
}

 class InterThread {
    public static void main(String[] args) {
        Buffer obj = new Buffer();
        Producer p = new Producer(obj);
        Consumer c = new Consumer(obj);

        p.start();
        c.start();
    }
}
