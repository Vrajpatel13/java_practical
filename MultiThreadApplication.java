public class practical34 {
    import java.util.Random;

class RandomNumberGenerator extends Thread {
    private final Object lock;

    public RandomNumberGenerator(Object lock) {
        this.lock = lock;
    }

    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(100);
            synchronized (lock) {
                MultiThreadApplication.lastNumber = number;
                lock.notifyAll();
                System.out.println("Generated: " + number);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class EvenNumberProcessor extends Thread {
    private final Object lock;

    public EvenNumberProcessor(Object lock) {
        this.lock = lock;
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (MultiThreadApplication.lastNumber % 2 == 0) {
                    int square = MultiThreadApplication.lastNumber * MultiThreadApplication.lastNumber;
                    System.out.println("Square: " + square);
                }
            }
        }
    }
}

class OddNumberProcessor extends Thread {
    private final Object lock;

    public OddNumberProcessor(Object lock) {
        this.lock = lock;
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (MultiThreadApplication.lastNumber % 2 != 0) {
                    int cube = MultiThreadApplication.lastNumber * MultiThreadApplication.lastNumber * MultiThreadApplication.lastNumber;
                    System.out.println("Cube: " + cube);
                }
            }
        }
    }
}

public class MultiThreadApplication {
    public static int lastNumber;

    public static void main(String[] args) {
        Object lock = new Object();
        
        RandomNumberGenerator generator = new RandomNumberGenerator(lock);
        EvenNumberProcessor evenProcessor = new EvenNumberProcessor(lock);
        OddNumberProcessor oddProcessor = new OddNumberProcessor(lock);

        generator.start();
        evenProcessor.start();
        oddProcessor.start();
    }
}

}
