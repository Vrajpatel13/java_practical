public class HelloWorld {
    static class HelloWorldThread extends Thread {
        public void run() {
            System.out.println("Hello World");
        }
    }

    static class HelloWorldRunnable implements Runnable {
        public void run() {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start();
        



        Thread thread2 = new Thread(new HelloWorldRunnable());
        thread2.start();
    }
}
