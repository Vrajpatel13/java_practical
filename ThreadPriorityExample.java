class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread firstThread = new MyThread("FIRST");
        MyThread secondThread = new MyThread("SECOND");
        MyThread thirdThread = new MyThread("THIRD");

        firstThread.setPriority(3);
        secondThread.setPriority(Thread.NORM_PRIORITY);
        thirdThread.setPriority(7);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
