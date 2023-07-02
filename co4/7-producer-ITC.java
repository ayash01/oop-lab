import java.util.ArrayList;

class Producer implements Runnable {
    private final ArrayList<Integer> buffer;
    private final int capacity;

    public Producer(ArrayList<Integer> buffer, int capacity) {
        this.buffer = buffer;
        this.capacity = capacity;
    }

    public void run() {
        int value = 0;

        while (true) {
            synchronized (buffer) {
                while (buffer.size() == capacity) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException exception) {
                        System.out.println(exception);
                    }
                }
                System.out.println("Produced " + value);
                buffer.add(value);
                value++;
                buffer.notify();
            }
        }
    }
}

class Consumer implements Runnable {
    private final ArrayList<Integer> buffer;

    public Consumer(ArrayList<Integer> buffer) {
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.size() == 0) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException exception) {
                        System.out.println(exception);
                    }
                }
                int value = buffer.remove(0);

                System.out.printf("Consumed" + value);

                buffer.notify();
            }
        }
    }
}

class ITCDemo {
    public static void main(String[] args) {
        ArrayList<Integer> buffer = new ArrayList<>();
        int capacity = 10;

        Runnable producer = new Producer(buffer, capacity);
        Runnable consumer = new Consumer(buffer);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}