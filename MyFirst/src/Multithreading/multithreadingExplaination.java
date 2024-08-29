/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */


//States of thread - ready, new, running and blocked
//Some important constructors in Multithreading
//Thread(), Thread(String name), Thread(Runnable r),Thread(Runnable r, String name),Thread(ThreadGroup g, String name)
//Priority - from 1-10 in java, threads priority is managed by schedulaer in JVM

//getxxx()
//long getId()
//String getName()
//int getPriority()
//Thread.State getState()
//ThreadGroup getThreadGroup()

//setxxx()
//void setName(String name)
//void setPriority(int p)
//void setDaemon(boolean d) - it is a background thread with least priority (eg: Garbage collector)

//Enqiry
//boolean isAlive()
//boolean isDaemon()
//boolean isInterrupted()

//Instance Methods
//void interrupt()  -   by calling this a thread can be interuppted
//void join() - if a thread has finished it job instead of getting terminated, It can wait for other thread to finish their job
//void join(long mills) - 
//void run()
//void start()

//static methods - can be used by just calling the class name without creating any object
//int activeCount() -   how many threads are active in a group
//Thread currentThread()    -   reference to a current thread
//void yield()  -   When higher priority elements are running continuosly without giving time to lower ones(This is known as starvation) - this can hold the higher for some time so lower priority gets some time
//void dumpStack() - for knowing the sequence of method calls 



//The below example shows how the task runs one after another
//public class multithreadingExplaination {
//    static void display()
//    {
//        System.out.println("Hello");
//    }
//    public static void main(String []args)
//    {
//        display();
//        System.out.println("Hello world");
//    }
//}

//Now similar to the above is the below prodram 
//We want this to run simultaniously, there are 2 infinite loops in different functions we want them both to work together 
//So we use the concept of threads to run them simultaniously

public class multithreadingExplaination {
    static void display()
    {
        int i=1;
        while(true)
        {
            System.out.println("Hello");
            i++;
        }
    }
    public static void main(String []args)
    {
        display();     //Once it gets into the above function it is struck in the infinite loop it doesnt execute the below infinite loop
        int i=1;
        while(true)     //To execute this also simultaniously - we use threads
        {
            System.out.println("Hello world");
            i++;
        }
    }
}

//Java provides thread class and runnabale interface for multithreading
//Use thread class and extend from your class
//If your class is already extending from another class then use the runnable interface to inplement the threads
