public class practical33 {
    import java.util.Scanner;

class SumTask implements Runnable {
    private int start;
    private int end;
    private static int totalSum = 0;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;

    }
    public void run() {
        int partialSum = 0;
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
        synchronized (SumTask.class) {
            totalSum += partialSum;
        }
    }

    public static int getTotalSum() {
        return totalSum;
    }
}

public class ThreadedSummation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        System.out.print("Enter number of threads: ");
        int numThreads = scanner.nextInt();

        Thread[] threads = new Thread[numThreads];
        int range = N / numThreads;
        int remainder = N % numThreads;
        int start = 1;

        for (int i = 0; i < numThreads; i++) {
            int end = start + range - 1;
            if (i == numThreads - 1) {
                end += remainder;
            }
            threads[i] = new Thread(new SumTask(start, end));
            threads[i].start();
            start = end + 1;
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total Sum: " + SumTask.getTotalSum());
    }
}


}
