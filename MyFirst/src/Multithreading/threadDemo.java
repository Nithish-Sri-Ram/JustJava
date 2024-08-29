/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */



//Whenever you extend from the thread class you must always override the run() method - public void run()
//When an object is created and to run the thread we should not call the run method - we should call the start()


//class MyThread extends Thread
//{
//    public void run()
//    {
//        int i=0;
//        while(true)
//        {
//            System.out.print("hello");
//            i++;
//        }
//    }
//}
//
//public class threadDemo {
//    public static void main(String []args)
//    {
//        MyThread t=new MyThread();
//        t.start();
//        int i=0;
//        while(true)
//        {
//            System.out.print(" World");
//            i++;
//        }
//    }
//}



//The same above code written in 2 seperate classes can be written in 1 single class
public class threadDemo extends Thread
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println("Hello");
            i++;
        }
    }
    public static void main(String args[])
    {
        threadDemo t=new threadDemo();
        t.start();
        int i=0;
        while(true)
        {
            System.out.println("World");
            i++;
        }
    }
}