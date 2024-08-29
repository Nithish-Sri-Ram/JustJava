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
            System.out.println("Thread "+count++);
        }
    }
}

public class yieldDemo {
    public static void main(String []args) throws Exception
    {
        MyThread t1=new MyThread("My Name 1");
        t1.start();
        int i=1;
        while(true)
        {
            System.out.println("Main "+i++);
            Thread.yield();     //This yields more time to MyThread - mostly used when faced a starving situation
        }
    }
}