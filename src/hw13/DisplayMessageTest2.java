package hw13;

/**
 * Main thread will NOT wait for a child thread to complete before exiting, and will simply exit while
 * the child thread is working tirelessly. This is because a child thread is a Daemon thread.
 */

public class DisplayMessageTest2 {

    public static void main(String[] args) throws InterruptedException {

        Runnable hello = new DisplayMessage("Hello");
        Thread t = new Thread(hello);
        t.setDaemon(true);              //<<<---------------- Daemon thread.
        t.start();

        Thread.sleep(2000);

        System.out.println("waiting....");

    }
}
