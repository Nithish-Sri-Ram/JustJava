/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */

// Thread Synchronization is the responsibility of the Java developer, not the machine
// This is inter-thread communication
// For one shared object, 1 producer might have multiple consumers
// So whenever the thread has finished, it will notify, and others will race to fill in this position (This is known as race condition)
// The above condition might even happen where after producer, even before all the consumers access it, the producer might once again go in
// So to maintain the order we'll maintain a count

// Here true means producer's chance and false means consumer's chance
// Notify will bring all the blocked threads, and it will bring up one of the threads and assign it to the data object
// notify() - will inform one of the threads - we don't know which one, notifyAll() will inform all the threads

class Data {
    int value;
    boolean flag = true; // true means producer's turn, false means consumer's turn

    // Producer method to produce data
    synchronized void set(int value) {
        while (!flag) { // If it's not producer's turn, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value;
        System.out.println("Produced: " + value);
        flag = false; // Set the flag to consumer's turn
        notify(); // Notify the consumer
    }

    // Consumer method to consume data
    synchronized int get() {
        while (flag) { // If it's not consumer's turn, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + value);
        flag = true; // Set the flag to producer's turn
        notify(); // Notify the producer
        return value;
    }
}

class Producer extends Thread {
    Data data;

    Producer(Data data) {
        this.data = data;
    }

    public void run() {
        int i = 0;
        while (true) {
            data.set(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Data data;

    Consumer(Data data) {
        this.data = data;
    }

    public void run() {
        while (true) {
            data.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Data data = new Data(); // Shared object

        // Creating producer and consumer threads
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        // Starting the threads
        producer.start();
        consumer.start();
    }
}
