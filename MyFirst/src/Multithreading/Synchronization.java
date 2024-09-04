/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */

// Synchronization meaning - understanding/coordination
// 1) Resource sharing - More than one thread accessing the same resource (thread has its own stack memory space, but heap is common - if there is an object in heap, that can be accessed by multiple threads)
// 2) Critical section - Lines of code which are accessing the shared resource - that may cause problems (What problem? - simultaneous access - it should access only one after another)
// 3) Mutual Exclusion - Happening of one prevents the happening of another - when one is accessing, the other should not access
// 4) Locking/Mutex - 2 threads are coordinating by just one variable and they may overlap (not as good as the next one (5) - functions available (lock, read, write, unlock))
// 5) Semaphore - In older days, the OS would take care of this (supported by Unix) OS has 2 methods wait() and signal() - functions available (wait, read, write, signal)
// 6) Monitor - This is what is used in Java - the only functions available are with a shared object (sd) sd.read(), sd.write()
// 7) Race condition - When two or more threads can access shared data and try to change it simultaneously.
// 8) Inter-Thread Communication - Coordination between threads for executing tasks in a synchronized manner

// MONITOR - A monitor is a synchronization construct that allows threads to have both mutual exclusion and the ability to wait (block) for a certain condition to become true.

class MyData {
    // If the display method is accessed by multiple threads simultaneously, the characters may mix.
    // Synchronization ensures that the display method is accessed by only one thread at a time.
    
    // Option 1: Synchronize using a synchronized block
    // void display(String str) {
    //     synchronized(this) {  // Only one thread will be allowed at a time
    //         for(int i = 0; i < str.length(); i++) {
    //             System.out.println(str.charAt(i));
    //         }
    //     }
    // }
    
    // Option 2: Synchronize using a synchronized method
    synchronized void display(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try { 
                Thread.sleep(1000); 
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    MyData d;
    Thread1(MyData d) {
        this.d = d;
    }
    public void run() {
        d.display("Hello World");
    }
}

class Thread2 extends Thread {
    MyData data;
    Thread2(MyData data) {
        this.data = data;
    }
    public void run() {
        data.display("Welcome");
    }
}

public class Synchronization {
    public static void main(String[] args) {
        MyData d = new MyData();
        Thread1 t1 = new Thread1(d);
        Thread2 t2 = new Thread2(d);
        t1.start();
        t2.start();
        // The order of starting the threads doesn't matter because of synchronization.
        // Even if you uncomment the following lines and comment out the above start lines, the output will still be synchronized.
        // t2.start();
        // t1.start();
    }
}
