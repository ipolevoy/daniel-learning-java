package hw13;

/**
 * Main thread will wait for a child thread to complete before exiting
 */
public class DisplayMessageTest {

    public static void main(String[] args) {

        Runnable hello = new DisplayMessage("Hello");
        new Thread(hello).start();

        System.out.println("waiting....");

    }
}
