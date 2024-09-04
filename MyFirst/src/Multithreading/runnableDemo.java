/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */

// if a horse is a thread, then a runnable is like a chariot or cabin
// the implementing class is not a thread in itself - it is capable of running but can't run by itself
// It is just a class implementing the runnable interface
// create an object of thread and attach the object of the class to the thread 

// class My implements Runnable
// {
//     public void run()
//     {
//         int i = 1;
//         while(true)
//         {
//             System.out.println("Hello");
//             i++;
//         }
//     }
// }

// public class runnableDemo {
//     public static void main(String args[])
//     {
//         My m = new My();
//         Thread t = new Thread(m);
//         t.start();
//         int i = 1;
//         while(true)
//         {
//             System.out.println("World");
//             i++;
//         }
        
//     }
// }

class runnableDemo implements Runnable
{
    public void run()
    {
        int i = 1;
        while(true)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String args[])
    {
        // Creating an instance of the runnableDemo class
        runnableDemo m = new runnableDemo();
        
        // Attaching the runnable to a thread
        Thread t = new Thread(m);
        
        // Starting the thread
        t.start();
        
        int i = 0;
        while(true)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
