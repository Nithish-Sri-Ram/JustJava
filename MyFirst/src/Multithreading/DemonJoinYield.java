package Multithreading;

/**
 * Demonstrates the use of daemon threads, join(), and sleep() methods in Java's multithreading.
 *
 * @author nithish
 */

class MyThread extends Thread {
    public MyThread(String name) { // Constructor to set the name of the thread
        super(name);
    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(getName() + ": " + count++);
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds to slow down the output
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class DemonJoinYield { // The name is Daemon, not Demon
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread("MyThread-1");
        t1.setDaemon(true); // This ensures that the thread is a daemon thread
        t1.start();

        // Allow the daemon thread to run for a short while
        try {
            Thread.sleep(500); // Main thread sleeps for 500 milliseconds, allowing t1 to run
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Join - force the main method to wait for the thread to complete
        // In this case, it doesn't make much sense because the daemon thread runs indefinitely
        t1.join(100); // Wait for t1 to finish for 100 milliseconds (which it never will, as it's a daemon)

        // After 500 milliseconds, the main thread will end, and since t1 is a daemon thread,
        // it will be terminated when the main thread finishes.
        System.out.println("Main thread ending. Daemon thread will terminate now.");
    }
}
