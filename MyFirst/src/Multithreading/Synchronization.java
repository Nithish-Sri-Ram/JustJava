/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */

//synchronization meaning - understanding/coordination
//1)resource sharing - more than one threads accessing same resource  (thread has it's own stack memory space, but heap is common - if there is an object in heap that can be accessed by multiple threads)
//2)Critical section - Lines of code which are accessing the shared resource - that may cause problems (what problem? - simultanious access - it should access only one after another)
//3)Mutual Exclusion - Happening of one prevents hapenning of another - when one is accessing the other should not access 
//(4,5,6) - some system which is taking care of it, (7,8) -coordination between each other if multiple threads are there
//4)Locking/Mutex - 2 threads are coordinating by just one variable and they may overlapp (so this is not as good as the next one (5) - functions available (lock,read,write,unlock)
//5)Semaphore - In the older days the OS will take care of this one (this was supported by unix) OS has 2 methods wait() and signal() - functions available (wait,read,write,signal)
//6)Monitor - This is what is used in Java - the only fuctions avilable are with a shared object (sd) sd.read(), sd.write()
//7)Race condition
//8)Inter-Thread Communication

//MONITOR - 


class MyData
{
    //display   -   2 threads are simutaniously accessing so the letters will be mixed, we cannot guarentee which form it will be if we don't use synchronization
    //If we use synchronization - java will make sure each thread access this funtion one after another 
    //To synchronize we have to make this function as monitor - how? -> by writing a synchronized block or by writing a synchronized method 
//    void display(String str)
//    {
////        for(int i=0;i<str.length();i++)             - //This part of the code - this for loop is accessed by multiple threads so it is know as critical data
////        {
////            System.out.println(str.charAt(i));
////        }
//        
//        //we can make the for loop as a monitor by making it a synchronized block
//        synchronized(this)  //only one thread will be allowed at a time 
//        {
//            for(int i=0;i<str.length();i++)
//            {
//                System.out.println(str.charAt(i));
//            }
//        }
//        
//        
//    }
    
    //If not want to make a sychronized block - you can make this whole method as synchronized by adding keyword in fromt of the method
   
    synchronized void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
            try{Thread.sleep(1000);}catch(InterruptedException e){} //Eventhough that we induce sleep synchronization will still work
        }
    }
}

class Thread1 extends Thread
{
    MyData d;
    Thread1(MyData d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World");
    }
}

class Thread2 extends Thread
{
    MyData data;
    Thread2(MyData data)
    {
        this.data=data;
    }
    public void run()
    {
        data.display("Welcome");
    }
}

public class Synchronization {
    public static void main(String []args)
    {
        MyData d=new MyData();
        Thread1 t1=new Thread1(d);
        Thread2 t2=new Thread2(d);
        t1.start();
        t2.start();
//        t2.start();
//        t1.start();
    }
}
