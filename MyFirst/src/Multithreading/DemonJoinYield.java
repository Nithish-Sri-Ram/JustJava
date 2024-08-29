/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */
class MyThread extends Thread
{
    public MyThread(String name)      //Yes we can define a constructor for extended thread class
    {
        super(name);        //now the name for MyThread will be set
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}

public class DemonJoinYield {       //The name is Daemon  - works as a garbage collector
    public static void main(String []args) throws Exception
    {
        MyThread t1=new MyThread("My Name 1");   
        t1.setDaemon(true);     //this ensures that when the main application is terminated then the daemon thread will also terminate 
        t1.start();
        
        try{t1.sleep(100);}catch(Exception e){}     //I'm including this line to wait for 100 milli seconds befor the program gets terminated - sleep() throws InterruptedException
        
        //Join  - force main method to wait for the threads to complete - call join method on main thread 
        Thread mainThread=Thread.currentThread();       //to get the reference of current thread
        mainThread.join();      //eventhought there is a daemon thread - it will anyhow wait for the thread to complete because of the join we induced
        
    }   //After performing the above operations the main method should end but insted it waits for the thread class to finish 
}