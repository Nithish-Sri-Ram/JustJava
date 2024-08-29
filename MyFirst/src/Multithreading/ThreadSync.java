/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Multithreading;

/**
 *
 * @author nithish
 */

//Thread Synchronization is the responsibility of the java developer not the machine
//This is interthread communication
//For one share object 1 producer - it might have multiple consumers
//SO whenever the thread has finished it will notify and others will race to fill in this [osition(This is known as race condition)
//The above condition might even happen where after producer even before all the consumers access it, the producer might once again go in 
//So to maintain the order we'll maintain a count


//Here true means producers chance and false means consumers chance
//Notify will bring all the blocked threads and, it will bring up on of the threads and assign it to data object
//notify() - will inform one of the threads - wh don't lnow which one, notifyAll() will inform all the threads
public class ThreadSync {
    
}
