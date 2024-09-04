package Multithreading;

/**
 *
 * @author nithish
 */

// States of thread - ready, new, running and blocked
// Some important constructors in Multithreading
// Thread(), Thread(String name), Thread(Runnable r), Thread(Runnable r, String name), Thread(ThreadGroup g, String name)
// Priority - from 1-10 in java, threads priority is managed by scheduler in JVM

// getxxx()
// long getId()
// String getName()
// int getPriority()
// Thread.State getState()
// ThreadGroup getThreadGroup()

// setxxx()
// void setName(String name)
// void setPriority(int p)
// void setDaemon(boolean d) - it is a background thread with least priority (e.g., Garbage collector)

// Enquiry
// boolean isAlive()
// boolean isDaemon()
// boolean isInterrupted()

// Instance Methods
// void interrupt() - by calling this a thread can be interrupted
// void join() - if a thread has finished its job instead of getting terminated, It can wait for other threads to finish their job
// void join(long mills)
// void run()
// void start()

// static methods - can be used by just calling the class name without creating any object
// int activeCount() - how many threads are active in a group
// Thread currentThread() - reference to a current thread
// void yield() - When higher priority elements are running continuously without giving time to lower ones (This is known as starvation) - this can hold the higher for some time so lower priority gets some time
// void dumpStack() - for knowing the sequence of method calls 

// The below example shows how the task runs one after another
// public class multithreadingExplanation {
//     static void display() {
//         System.out.println("Hello");
//     }
//     public static void main(String []args) {
//         display();
//         System.out.println("Hello world");
//     }
// }

// Now similar to the above is the below program 
// We want this to run simultaneously, there are 2 infinite loops in different functions we want them both to work together 
// So we use the concept of threads to run them simultaneously

// Class that extends Thread to perform a task in a separate thread
class MyThread extends Thread {
    String message;

    // Constructor to initialize the thread with a message
    MyThread(String message) {
        this.message = message;
    }

    // The run method contains the code that will be executed in the new thread
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(message + " " + i);
            i++;
            try {
                Thread.sleep(500); // Sleep for 500ms to slow down the output
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultithreadingExplanation { 
    public static void main(String[] args) {
        // Creating two threads
        MyThread t1 = new MyThread("Hello");
        MyThread t2 = new MyThread("Hello world");

        // Starting both threads
        t1.start();
        t2.start();
        
        // Additional thread information
        System.out.println("Thread t1 ID: " + t1.getId());
        System.out.println("Thread t2 ID: " + t2.getId());
        System.out.println("Thread t1 Name: " + t1.getName());
        System.out.println("Thread t2 Name: " + t2.getName());
    }
}

// Java provides thread class and runnable interface for multithreading
// Use thread class and extend from your class
// If your class is already extending from another class then use the runnable interface to implement the threads
