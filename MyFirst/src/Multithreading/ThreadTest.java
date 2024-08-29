/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */

class MyRun implements Runnable
{
    public void run()
    {
        
    }
}

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
            try
            {
                Thread.sleep(1000);   //wait time of 10ms before it comes into the loop again
            }
            catch(InterruptedException e)       //Thread.sleep throws InterruptedException and it must be caught
            {
                System.out.println(e);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String []args) throws Exception
    {
        Thread t=new Thread(new MyRun(),"My Name");
        Thread tn=new Thread("My Name");
        MyThread t1=new MyThread("My Name 1");
        
        t1.start();
        t1.interrupt();     //This is how we can interrupt the above thread
        
        
        //Methods of Thread Classes
        System.out.println("ID "+tn.getId());
        System.out.println("Name "+tn.getName());
        System.out.println("Priority "+tn.getPriority());
        System.out.println("State "+tn.getState());
        System.out.println("Alive "+tn.isAlive());
        
        
        
        System.out.println("ID "+tn.getId());
        System.out.println("Name "+tn.getName());
        System.out.println("Priority "+tn.getPriority());
        tn.start();
        System.out.println("State "+tn.getState());
        System.out.println("Alive "+tn.isAlive());
        
        
        
        tn.setPriority(Thread.MAX_PRIORITY);
        System.out.println("ID "+tn.getId());
        System.out.println("Name "+tn.getName());
        System.out.println("Priority "+tn.getPriority());
        System.out.println("State "+tn.getState());
        System.out.println("Alive "+tn.isAlive());
        
    }
}
